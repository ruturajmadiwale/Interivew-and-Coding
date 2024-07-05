import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WalmartTest {

    public static void uniqueString(String s) {
        String uniqueString="";
        for(int i=0; i<s.length(); i++) {
            int count=0;
            char c = s.charAt(i);
       /*     if(!uniqueString.contains(c+"")) {
                uniqueString+=c+"";
            }*/
            for (int j=0; j<s.length(); j++) {
                char d = s.charAt(j);
                if(c==d & i!=j)
                    count++;
            }
            if(count>0 & !uniqueString.contains(c+""))
                uniqueString+=c+"";
        }
        System.out.println(uniqueString);
    }

    public static void test3() {
        String input = "Wow aaabc, Rakuten India Research and Development Center";

        //op:  aa 2, ia 1, ea 1

        input = input.replace(",", "");
        String[] arr = input.split(" ");

        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char[] c = s.toCharArray();
            int count = 0;
            for (int j = 0; j < c.length; j++) {

                if (c[j] == 'a' | c[j] == 'e' | c[j] == 'i' | c[j] == 'o' | c[j] == 'u') {
                    if (j != c.length-1 && (c[j + 1] == 'a' | c[j + 1] == 'e' | c[j + 1] == 'i' | c[j + 1] == 'o' | c[j + 1] == 'u')) {
                        count++;
                        list.add(c[j]+"" + c[j + 1] + "");
                        set.add(c[j]+"" + c[j + 1] + "");
                    }
                }
            }
        }

        System.out.println(list);
        System.out.println(set);
    }

    public static void main(String[] args) {
        String text = "chutiyeueyt";
        //uniqueString(text);
        test3();

    }
}
