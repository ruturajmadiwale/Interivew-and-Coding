import java.util.Arrays;

public class shifing {
    public static void main(String[] args) {
        int[] arr ={5, 2, 7, 1, 4};
        int[] output = rearrangeArray(arr);
        System.out.println(Arrays.toString(output));
    }

    public static int[] rearrangeArray(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        reverse(arr); // Reverse the array
        rotateRight(arr); // Rotate the array to the right by one position
        return arr;
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRight(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
