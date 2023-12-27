import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class addPet {
    @BeforeAll
    @Story("Delete Pet in case that exists")
    public void deletePet() {

        String petId;
        given()
                .contentType(ContentType.JSON)
                .with()
                .pathParam("petId", 55)
                .when()
                .delete("https://petstore.swagger.io/v2/pet/{petId}");

    }

    @Test
    @Story("Add Pet to the Store")

    public void postAddPet() {

        String body = """
                {
                "name": "TestPet",
                "photoUrls": [],
                "id": 55,
                "category": {
                    "id": "2",
                    "name": "Beagle"
                    }
                }
                        """;
        given().log().all()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://petstore.swagger.io/v2/pet/")


                //Schema Response Validation
                .then()
                .statusCode(200)
                .and()
                .body("name", equalTo("TestPet"))
                .body("name", equalTo("TestPet"));


    }
}
