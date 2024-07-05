public class Test {
    public static void main(String[] args) {

//        String s = "aaabbchhhbee2ffbb";
//        char[] chars = s.toCharArray();
//        int count=1;
//        for(int i=0; i<chars.length; i++) {
//            char a = chars[i];
//            if(i!=(chars.length-1) && (chars[i]==chars[i+1])) {
//                count++;
//            }
//            else {
//                System.out.print(count+""+a);
//                count=1;
//            }
//
//        }

        int[] arr = {3, 12, 0, 5, 4, 0, 3, 0, 0, 0};
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int j = index; j < arr.length; j++) {
            arr[j] = 0;
    }
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }

}
