
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer input = Integer.valueOf(scanner.nextLine());

        Integer squared = input * input;

        System.out.println(squared);

    }
}
