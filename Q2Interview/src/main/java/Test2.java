public class Test2 {

    public static void substring(String s1, String s2) {

        int hardCount=0; int softCount=0;
        for(int i=0; i<s1.length();i++) {
                if(s2.contains(""+s1.charAt(i))) {
                    softCount++;
                }
                else  {
                    if(softCount>hardCount)
                        hardCount=softCount;
                    softCount=0;
                }
        }
        System.out.println(hardCount);
    }


    public static void main(String[] args) {
/*                int[] arr ={5,2,7,1,4};
        //output ={7,1,4,5,2}

        for(int i=0;i<arr.length-2; i++) {
            int temp=arr[i+2];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+",");
        }*/

        substring("abcdefacbccbagfacbacer","abc");
    }
}
