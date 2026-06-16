import java.util.Scanner;
public class Prob_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows/columns (0 to exit): ");
        int n = sc.nextInt();

        if (n == 0) {
            return;
        }

        int[][] arr = new int[n][n];
        int[] colSum = new int[n];
        int grandTotal = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                System.out.printf("%-5d", arr[i][j]);
                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
            }

            grandTotal += rowSum;
            System.out.printf("%-5d%n", rowSum);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d", colSum[i]);
        }

        System.out.printf("%-5d%n", grandTotal);

        sc.close();
    }
}

