
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        divisibleByThreeInRange(first, second);

    }

    public static void divisibleByThreeInRange(int numerator, int denominator) {
        for (int i = numerator; i <= denominator; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
