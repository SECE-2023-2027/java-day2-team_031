import java.util.Arrays;
public class Prob_9 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
