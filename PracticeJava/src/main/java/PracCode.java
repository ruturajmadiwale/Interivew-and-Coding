import java.util.Collections;

public  class PracCode {
    public static final int y=1;
    public static int act;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    private  int x;

    public  void testStart() {

    }

    public static void palindrome(String text) {
        text = text.replace(" ","");
        System.out.println(text);
        String newString = "";
        for(int i=text.length()-1; i>=0; i--) {
            newString+=text.charAt(i);
        }
        if(text.equalsIgnoreCase(newString)) {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");
    }

    public static void sortIntArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static String sortStringArray(String text1) {
        text1 = text1.replace(" ","");
        char[] arr1 = text1.toLowerCase().toCharArray();
        for(int i=0; i<text1.length(); i++) {
            for (int j=i+1; j<text1.length(); j++) {
                if(arr1[j]<arr1[i]) {
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        //System.out.println(arr1);
        return String.valueOf(arr1);
    }

    public static void anagram(String text1, String text2) {
        System.out.println("text1:"+sortStringArray(text1));
        System.out.println("text2:"+sortStringArray(text2));
        if(sortStringArray(text1).equalsIgnoreCase(sortStringArray(text2)))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }

    public static void main(String[] args) {
        //String text = "Too hot to hoot";
        //int a = 0;
        //palindrome(text);
        //palindrome(Integer.toString(a));
        //System.out.println(4-10);

        //anagram brush = shrub or Dictionary = indicatory

        String text1 = "abc";
        //String text2 = "dirty room";

        int [] arr = {5,2,6,1,0,10,8,9};

        //sortIntArray(arr);

       // anagram(text1,text2);

        generatePermutation(text1,0,text1.length());

    }

    public static void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1)
            System.out.println(str);
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



}
