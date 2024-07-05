package digikeytest;

import org.openqa.selenium.JavascriptExecutor;

public class JavaTest {

    public  static void  sumOfNumber(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0) {
                arr[i]*=-1;
            }
            sum+=arr[i];
        }
        System.out.println("Sum is:"+sum);
    }

    public  static  void reverseString(String s) {
        String reverseWord="";
        for(int i=s.length()-1; i>=0; i--) {
            reverseWord+=s.charAt(i);
        }
        reverseWord=reverseWord.replace(String.valueOf(reverseWord.charAt(0)),String.valueOf(reverseWord.charAt(0)).toUpperCase());
        System.out.println(reverseWord);
    }

    public  static  void palindrome(int n) {
    int sum=0; int temp=n;
    while (n>0) {
        int r = n%10;
        sum =(sum*10)+r;
        n=n/10;
    }
    if(temp==sum)
        System.out.println("palindrome");
    else
        System.out.println("Not palindrome");
    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,2,-2,-3};
        sumOfNumber(arr);
        String s ="shruti";
        reverseString(s);
        palindrome(414);




    }

}
