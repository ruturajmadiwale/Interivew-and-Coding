import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeProgram {

    public  static  void  removeDuplicatesFromString(String[] s) {
        Set<String> set = new HashSet<String>(Arrays.asList(s));
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public  static void reverseArray(int[] arr) {
        int start=0; int end=arr.length-1;
        while(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public  static  void findSubString(String s1, String s2) {
        //abcd //abc
        int count=0;
        for(int i=0; i<s1.length()+1-s2.length(); i++) {
            String subString="";
            subString+=s1.substring(i,i+s2.length());
            //System.out.println(subString);
            if(subString.equals(s2)) {
                System.out.println(subString);
                count++;
            }
        }
        System.out.println("Total substring:"+count);
    }

    public static void main(String[] args) {
        //remove duplicates form an array
        String[] s ={"aadfghh","aadfghh","df","ad"};
        //removeDuplicatesFromString(s);
        //int[] arr={1,2,3,4,5};
       // reverseArray(arr);
        int[] arr ={5,2,7,1,4};//4,1,7,2,5
        //7,5,4,2,1  //1,2,4,5,7
        //output ={7,1,4,5,2}
        findSubString("aaaa","aa");
    }
}
