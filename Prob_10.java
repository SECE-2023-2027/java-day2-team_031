public class Prob_10 {
    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};

        if (array.length >= 2 && array[0] == array[array.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}