import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class RestAssuredPrgm2 {


    @Test
    public void firstTest() {
        baseURI = "https://rahulshettyacademy.com";
        String postResource = "/maps/api/place/add/json";

        String response=
        given().queryParam("Key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(payload.postNewPlace())
                .when().post(postResource)
                .then()
                .log().all()
                .statusCode(200)
                .body("status",equalTo("OK"))
                .extract().response().asString()
        ;
        JsonPath js = new JsonPath(response);
        String placeId = js.get("place_id");

        System.out.println(placeId);


    }

}
