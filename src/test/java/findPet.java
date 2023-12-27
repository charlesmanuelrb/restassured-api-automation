import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class findPet {
    @Test
    @Story("Find Pet by Id")
    public void getFindPet() {
        String petId;
        given().log().all()
                .contentType(ContentType.JSON)
                .with()
                .pathParam("petId", 55)
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}")

                //Schema Response Validation
                .then()
                .statusCode(200)
                .and()
                .body("name", equalTo("TestPet"))
                .body("name", equalTo("TestPet"));
    }
}