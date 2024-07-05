import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;

public class RestApisTest {

    @Test
    public void testApis() {
        Response response = given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employees")
                .then().log().all().extract().response();
        String body = response.body().asString();
        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jp = new JsonPath(body);
        List<String> dataVal = jp.get("data");
        Map<Integer,String> mp = new HashMap<Integer, String>();
        for (int i=0; i<dataVal.size(); i++) {
            int idValue = Integer.valueOf(jp.getString("data["+i+"].id"));
            String nameValue = jp.getString("data["+i+"].employee_name");
            mp.put(idValue,nameValue);
        }
        List<Integer> sortedKeys = new ArrayList(mp.keySet());
        Collections.sort(sortedKeys);
        for(int val:sortedKeys){
            System.out.println(val+":"+mp.get(val));

        }
/*        for(Map.Entry<String,String> entry: mp.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/
    }


}
