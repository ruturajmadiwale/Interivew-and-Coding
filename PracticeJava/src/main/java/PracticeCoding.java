import java.util.*;

public class PracticeCoding {

    public static void duplicateInString(String s) {
        //s="abcab";
        String duplicateString="";
        for(int i=0; i<s.length(); i++) {
            String ith = s.charAt(i)+"";
            for(int j=0; j<s.length(); j++) {
                String jth = s.charAt(j)+"";
                if(i!=j & (ith.equalsIgnoreCase(jth) & !duplicateString.contains(ith)))
                    duplicateString+=ith;
            }
        }
        System.out.println("duplicateChars:"+duplicateString);
    }

    public static void uniqueChars(String s) {
        String uniqueChars="";
        for(int i=0; i<s.length(); i++) {
            String ith = s.charAt(i)+"";
            boolean dup = false;
            for(int j=0; j<s.length(); j++) {
                String jth = s.charAt(j)+"";
                if(i!=j & (ith.equalsIgnoreCase(jth) & !uniqueChars.contains(ith))) {
                    dup = true;
                    break;
                }

            }
            if(!dup)
                uniqueChars+=ith;
        }
        System.out.println("Unique Chars:"+uniqueChars);
    }
    public static void stringLength(String s) {
        int count=0;
        char[] arr = s.toCharArray();
   /*     for(int i=0; i<arr.length; i++) {
            count++;
        }*/
        for(char ch:s.toCharArray()) {
          count++;
        }
        System.out.println("String length for the string"+s+" is:"+count);
    }

    public static void largestNumberInAnArray(int[] arr) {
        int max=arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }

    public static void reverseString(String s) {
/*        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("reversed String:"+sb);*/

        String reversedString = "";
        for(int i=s.length()-1; i>=0; i--) {
            reversedString+=s.charAt(i);
        }

        System.out.println("reversed String is:"+reversedString);

    }

    public static void fibonacciWithoutRecursion(int n) {

        //without recusrion
        int prevVal=0; int newVal=1;
        System.out.print("Without recursion:"+0+" "+1+" ");
        //int newVal =0; int prevVal=1;
        for(int i=2; i<n; i++) {
            int temp = newVal;
            //prevVal = newVal;  //0,1,1,2,3,5,8
            newVal = newVal+prevVal;
            prevVal = temp;
            System.out.print(newVal+" ");
        }
        System.out.println();
    }

    public static void fiboWithRecursion(int n, int prevVal, int newval) {

        //with recursion
        int printVal=0;
        if(n>0) {
           printVal = prevVal +newval;
           prevVal = newval;
           newval = printVal;
            System.out.print(printVal+" ");
            //list.add(prevVal);
            fiboWithRecursion(n-1,prevVal,newval);
        }
        //System.out.println(list);
    }

    public static void printEvenFromArray(int[] arr) {
        System.out.println();
        System.out.print("Even numbers of array:");
        Set<Integer> ss = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) {
                System.out.print(arr[i]+",");
                ss.add(arr[i]);
            }
        }
        System.out.println();
        System.out.println("Set is:"+ss);
    }

    public static void findSpecialNumAlphaSmall(String s) {
        // s = "AbcD@12!
        List<Object> special = new ArrayList<Object>();
        List<Object> numeric = new ArrayList<Object>();
        List<Object> lowerCase = new ArrayList<Object>();
        List<Object> upperCase = new ArrayList<Object>();
        for (int i=0; i<s.length(); i++) {
            char charr = s.charAt(i);
            if((charr<'0'| charr>'9') & (charr<'A' | charr>'Z') & (charr<'a'| charr>'z'))
                //System.out.print(charr+" ");
                special.add(charr);
            else if(charr>='0' & charr<='9')
                numeric.add(charr);
            else if(charr>='A' & charr<='Z')
                upperCase.add(charr);
            else
                lowerCase.add(charr);

        }
        System.out.println("special chars:"+special);
        System.out.println("Numbers:"+numeric);
        System.out.println("Upper Case:"+upperCase);
        System.out.println("Lower Case:"+lowerCase);
    }

    public static void numIsPalindrome(int number) {
        //454 121  656  5445
        //454%10 = 4   454/10 = 45
        int sum =0; int r=0; int temp=number;
        while(number>0) {
            r = number%10;
            sum = (sum*10) +r;
            number = number/10;
        }
        if(sum==temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void anagramOrNot(String text1, String text2) {
        // brush  shrub
        text1 = text1.replace(" ","").toLowerCase();
        text2 = text2.replace(" ","").toLowerCase();
        char[] text1Char = text1.toCharArray();
        char[] text2Char = text2.toCharArray();
        Arrays.sort(text1Char);  Arrays.sort(text2Char);
        if(String.valueOf(text1Char).equalsIgnoreCase(String.valueOf(text2Char)))
            System.out.println("anagram");
        else
            System.out.println("Not anagram");
    }



    public static void main(String[] args) {
        String s = "AbcD@12!_89*(&";
        int[] arr = {35,2,0,10,2,8,25,-8};
        int n=8;
        duplicateInString(s);
        uniqueChars(s);
        stringLength(s);
        largestNumberInAnArray(arr);
        reverseString(s);
        fibonacciWithoutRecursion(n);
        System.out.print("Fibonacci with recurssion: 0 1 ");
        fiboWithRecursion(n-2,0,1);
        printEvenFromArray(arr);
        findSpecialNumAlphaSmall(s);
        numIsPalindrome(4554);
        anagramOrNot("Too Hot to handle","hot to handle too");

    }

}
