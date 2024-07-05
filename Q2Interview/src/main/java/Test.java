import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static String sorting(String str) {
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++) {
            for(int j=0; j<chars.length; j++) {
                if(chars[i]<chars[j]) {
                    char temp = chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
/*        int[] arr ={5,2,7,1,4};
        //output ={7,1,4,5,2}

        for(int i=0;i<arr.length-1; i++) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int j=0; j<arr.length;j++) {
            System.out.print(arr[j]+",");
        }*/

        String s1 ="card";
        String s2 = "care";

        //StringBuffer sb = new StringBuffer(s1);
        char[] cc = s1.toCharArray();
        Arrays.sort(cc);

        System.out.println(cc);

/*      String firstText=sorting(s1);
      String secondText=sorting(s2);
      if(firstText.equalsIgnoreCase(secondText)) {
          System.out.println("anagram");
      }
      else
          System.out.println("not");*/


    }
}
