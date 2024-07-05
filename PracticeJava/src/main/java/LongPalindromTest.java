import java.util.ArrayList;
import java.util.List;

public class LongPalindromTest {
   static List<String> list = new ArrayList<String>();
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1) {
            System.out.println(str);
            list.add(str);

        }
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }

    public static void main(String[] args) {
        String s = "rurasa";
        generatePermutation(s,0,s.length());
    }
}
