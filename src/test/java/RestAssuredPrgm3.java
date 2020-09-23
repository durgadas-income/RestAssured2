import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.stringContainsInOrder;

public class RestAssuredPrgm3 {


    @Test
    public void firstTest() {
        baseURI = "https://rahulshettyacademy.com";
        SessionFilter sessionFilt = new SessionFilter();

        //Create
        String placeIdReponse=
        given().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(payload.postNewPlace())
                .filter(sessionFilt)
                .when().post("/maps/api/place/add/json")
                .then()
                //.log().all()
                .extract().response().asString()
        ;

        JsonPath js = new JsonPath(placeIdReponse);
        String placeId = js.get("place_id");
        System.out.println(" ****** Create Block ****** ");
        System.out.println("Place Id is: "+placeId);


        //Read
        String getResponse=
        given()
                //.log().all()
                .queryParam("key", "qaclick123")
                .queryParam("place_id",placeId)
                .when().get("/maps/api/place/get/json")
                .then()
                //.log().all()
                .extract().response().asString()
                ;

        System.out.println(" ****** Read Block ****** ");
        //System.out.println("Get reponse is: "+getResponse);

        JsonPath js2 = new JsonPath(getResponse);
        String address = js2.get("address");
        System.out.println("Address is: "+address);

        //Update


        //Delete
        System.out.println(" ****** Delete Block ****** ");
        String deleteBody = "{\n" +
                "    \"place_id\":\""+placeId+"\"\n" +
                "}";

        given().queryParam("key","qaclick123")
                .header("Content-Type", "application/json")
                .body(deleteBody)
                .when().delete("/maps/api/place/delete/json")
                .then()
                .log().all()
                .body("status",equalTo("OK"))
         ;



    }

}
