import java.util.HashMap;
import java.util.Map;

public class TestArrayClass {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("Rutu",10); mp.put("Shruti",11); mp.put("srushti",12); mp.put("",null);

//        if(mp.containsKey("Shruti")) {
//            System.out.println(mp.get("shruti"));
//        }
        for(Map.Entry<String,Integer> mm : mp.entrySet()) {
            System.out.println(mm.getKey()+":"+mm.getValue());
        }


    }
}
