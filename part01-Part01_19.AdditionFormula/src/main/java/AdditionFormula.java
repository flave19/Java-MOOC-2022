
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        String one = String.valueOf(first);
        String two = String.valueOf(second);
        String total = String.valueOf(sum);

        System.out.println(one + " + " + two + " = " + total);
    }
}
