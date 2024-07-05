public class DigikeyInt {

    public static String  large2(int[] arr) {
        if(arr.length==0)
            return "no element present in the array";
        else if(arr.length==1)
            return "only 1 element so no 2nd large";
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int large2=arr[1];
        for(int j=1; j<arr.length; j++) {
            if(arr[j]!=arr[0]){
                large2=arr[j];
                break;
            }
        }
        if(large2==arr[0]){
            return "no 2nd large all elements in the array are of same value";
        }
        return Integer.toString(large2);
    }

    public  static  String find2largewithoutsorting(int[] arr) {
        if(arr.length==0)
            return "no element present in the array";
        else if(arr.length==1)
            return "only 1 element so no 2nd large";
        int max=arr[0]; int max2=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max2=max;
                max=arr[i];
            }
        }
        return Integer.toString(max2);
    }

    public static void main(String[] args) {
        //int[] arr={5,8,9,10,4,2,6,1,4};
        //int[] arr={5};
        //int[] arr={5,8,10,4,2,6,1,4,10};
        int[] arr={0,-1,0,-1};
        //int[] arr={500, 500};
        //int[] arr={-2,-1,-5,-4,-6};
        //int[] arr={};
        //System.out.println(large2(arr));
        System.out.println(find2largewithoutsorting(arr));
    }
}
