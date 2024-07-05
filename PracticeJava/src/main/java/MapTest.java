import io.restassured.response.Response;

import java.util.*;

import static io.restassured.RestAssured.given;

public class MapTest {

    public void test() {

    }

    public static void main(String[] args) {
//        Map<String, Integer> m = new HashMap<String, Integer>();
//        m.put("Rutu",101);
//        m.put("Raghu", 102);
//        m.put("Roopali", 103);
//
//        for(Map.Entry<String, Integer> e: m.entrySet()) {
//            System.out.println("Key is:"+e.getKey()+" Value is:"+e.getValue());
//        }

        Date d = new Date();

        //String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
        // d.toString().replace(":", "_").replace(" ", "_");
//        System.out.println(d.toString());
//        System.out.println(d.toString().replace(" ","").substring(8,16));
//        System.out.println(d.toString().replace(":", "_").replace(" ", "_"));


 //       Response resp = given().header("","").auth().preemptive().basic().when().then().log().all();
        //String p = resp.jsonPath();

        Set<String> set = new HashSet<String>();
        set.add("Helo"); set.add("New"); set.add("Art");
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        System.out.println(set);
        System.out.println(list);


    }

}
