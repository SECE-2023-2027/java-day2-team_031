import java.util.Scanner;

public class Prob_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input n (position from end)
        System.out.print("Enter n (from end): ");
        int k = sc.nextInt();

        int removeIndex = n - k;

        System.out.println("Array after removal:");

        for (int i = 0; i < n; i++) {
            if (i == removeIndex) continue;
            System.out.print(arr[i] + " ");
        }
    }
}