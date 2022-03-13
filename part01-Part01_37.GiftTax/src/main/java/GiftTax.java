
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        Integer num = Integer.valueOf(scan.nextLine());

        if (num < 5000) {
            System.out.println("No tax!");
        } else if (num >= 5000 && num <= 25000) {
            Double tax = 100 + ((num - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (num > 25000 && num <= 55000) {
            Double tax = 1700 + ((num - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        } else if (num > 55000 && num <= 200000) {
            Double tax = 4700 + ((num - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (num >= 200000 && num <= 1000000) {
            Double tax = 22100 + ((num - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (num > 100000) {
            Double tax = 142100 + ((num - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
