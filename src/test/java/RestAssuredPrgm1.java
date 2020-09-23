import io.restassured.path.json.JsonPath;


public class RestAssuredPrgm1 {

    public static void main(String[] args) {

        JsonPath js = new JsonPath(payload.coursePrice());

        int courseNumber= js.getInt("courses.size()");
        System.out.println("No of courses = " +courseNumber);

        int purchaseAmount = js.get("dashboard.purchaseAmount");
        System.out.println("Purchase Amount = "+purchaseAmount);

        String firstTitle=  js.get("courses[0].title");
        System.out.println("Title = "+firstTitle);

    }
}
