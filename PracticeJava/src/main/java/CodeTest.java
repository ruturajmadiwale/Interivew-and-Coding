import java.util.Locale;

public class CodeTest {

    public static void main(String[] args) {
        String s = "abcadc";
        s = s.toLowerCase();
       // System.out.println(s);
        String newString="";
        char[] c = s.toCharArray();

        for(int i=0; i<s.length(); i++) {
            boolean val = false;
            for(int j=0; j<c.length; j++) {
                if(s.charAt(i)==c[j] & i!=j) {
                    val = true;
                    break;
                }
            }
            if(val==true & !newString.contains(String.valueOf(c[i]))) {
                newString+=c[i];
            }

        }
        System.out.println(newString.replace(" ",""));
    }
}
