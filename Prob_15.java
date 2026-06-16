import java.util.Scanner;
public class Prob_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String result = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result += str.charAt(i) + "" + count;
            count = 1;
        }
        System.out.println("The compressed string along with the counts of repeated characters is:");
        System.out.println(result);
        sc.close();
    }
}