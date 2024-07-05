import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Page2 extends Page1 {
    public static void method() {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        Map<Integer, String> hm2 = new TreeMap<Integer, String>();
        hm.put(9, "Red");
        hm.put(12, "Black");
        hm.put(6, "Green");
        hm.put(19, "White");

        hm2.put(9, "Red");
        hm2.put(12, "Black");
        hm2.put(6, "Green");
        hm2.put(19, "White");
        //mp2.put(2,"Rutu"); mp2.put(1,"shruti"); mp2.put(3,"vivek");
        for(Map.Entry<Integer,String> entry: hm.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println();

        for(Map.Entry<Integer, String> entry: hm2.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void printSeparate() {
        String text = "abAc12@34a_89$";
        String specialChars="";
        String digits="";
        String alphbets="";
        char[] chrs = text.toCharArray();
        for (int i=0; i<chrs.length; i++) {
            if((chrs[i]>='A' & chrs[i]<='Z') | (chrs[i]>='a' & chrs[i]<='z')) {
                alphbets+=chrs[i];
            } else if (chrs[i]>='0' & chrs[i]<='9') {
                digits+=chrs[i];
            }
            else {
                specialChars+=chrs[i];
            }
        }
        System.out.println("Special chars:"+specialChars);
        System.out.println("digits:"+digits);
        System.out.println("alphabets:"+alphbets);
        System.out.println(digits instanceof String);
        System.out.println(Integer.valueOf(digits) instanceof Integer);
    }
    public static void main(String[] args) {
        //method();
        printSeparate();
    }
}
