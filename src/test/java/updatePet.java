import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class updatePet {
    @Test
    @Story("Modify Pet data by Id")
    public void putModifyPet() {

        String body = """
                {
                "name": "ModifiedPet",
                "photoUrls": [],
                "id": 55,
                "category": {
                    "id": "3",
                    "name": "Doberman"
                    }
                }
                        """;

        given().log().all()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://petstore.swagger.io/v2/pet/")
                .then()

                //Schema Response Validation
                .statusCode(200)
                .and()
                .body("name", equalTo("ModifiedPet"))
                .body("category.name", equalTo( "Doberman"));

    }
}
