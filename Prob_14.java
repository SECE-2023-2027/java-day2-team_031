import java.util.Scanner;
public class Prob_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Thursday", "Friday", "Saturday", "Sunday",
                         "Monday", "Tuesday", "Wednesday"};
        System.out.println("Input the month(1-12)");
        int month = sc.nextInt();
        System.out.println("Input date (1-31)");
        int date = sc.nextInt();
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += (date - 1);
        System.out.println("Name of the date:");
        System.out.println(week[totalDays % 7]);
        sc.close();
    }
}