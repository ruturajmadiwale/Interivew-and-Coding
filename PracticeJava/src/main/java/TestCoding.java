import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCoding {

    public static void duplicateFromArray(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    public static void duplicateFromArray2(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] & i != j) {
                    count++;
                }
            }
            if (count == 1)
                list.add(arr[i]);
        }
        System.out.println(list);
    }

    public static void countCharacters(String text) {
        String s = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!s.contains("" + c)) {
                s += c;
            }
        }
        System.out.println(s);
        for(int j=0; j<s.length(); j++) {
            char[] d = s.toCharArray();
            //System.out.println(d[j]);
            int count=0;
            char[] e = text.toCharArray();
            for(int k=0; k<text.length(); k++) {
                if(d[j]==e[k]){
                    count++;
                }
            }
            System.out.print(d[j]+""+count);
        }
        System.out.println();
    }

    public static void sortStrings() {
        List<String> list = new ArrayList<String>();
        list.add("String"); list.add("Dfer"); list.add("pdqD");
        Collections.sort(list);
        System.out.println(list);
    }

    public static void removeSpace() {
        String s = "space  g";
        String newString="";
        for (int i =0; i<s.length();i++) {
            if(!((""+s.charAt(i)).equalsIgnoreCase(" "))) {
                newString+=s.charAt(i);
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 8, 5, 2};
        //duplicateFromArray(arr);
        //duplicateFromArray2(arr);

        String s = "aabbbccccb";
        //countCharacters(s);
        //sortStrings();
        removeSpace();

    }



}
