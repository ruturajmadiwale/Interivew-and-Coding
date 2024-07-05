import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TestAPIs {


    @Test
    public void hitRequestWithoutBody() {
        Response response = given().
                queryParam("id",390).
                when().get("events").
                then().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jp = new JsonPath(response.body().asString());
        String val = jp.get("data");
        Assert.assertEquals("value",val);

    }
    @Test(groups = {"check"})
    public void simpleGroup() {
        System.out.println("Hello Groups");
    }

    @Test
    public void requestWithBody() {
        Response response = given().
                header("li-api-session-key","").
                body("").contentType("application-json").
                when().post("").then().log().all().extract().response();
        String body = response.getBody().asString();
        JsonPath jp = new JsonPath(body);

    }

    @Test
    public void requestWithAuth() {
        Response response = given().
                header("token","value").
                auth().preemptive().basic("admin","arfarf").when().get("").then().log().all().extract().response();
    }

    @Test
    public void browser() {
            given().header(conne)
    }

}
