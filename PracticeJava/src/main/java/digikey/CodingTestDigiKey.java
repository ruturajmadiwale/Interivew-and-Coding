package digikey;

public class CodingTestDigiKey {

    public static void sumOfNumbers(int arr[]) {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0)
                arr[i]=arr[i]*(-1);
            sum+=arr[i];
        }
        System.out.println("Sum is:"+sum);
    }

    public  static  void stringReverse(String s) {
        StringBuffer sbb = new StringBuffer(s);
        sbb.reverse();
        System.out.println("Reversed String by using inbuilt method is:"+sbb);
        //--------------------------------------------

        String reversedString="";
        for(int i=s.length()-1; i>-1; i--) {
            reversedString+=s.charAt(i)+"";
        }
        System.out.println("Reversed String without using inbuilt method is:"+reversedString);
    }

    public static void main(String[] args) {
        int arr[]= {5,3,8,2,-2,-3};
        sumOfNumbers(arr);
        //---------------
        String s = "Rutu";
        stringReverse(s);
    }

}
