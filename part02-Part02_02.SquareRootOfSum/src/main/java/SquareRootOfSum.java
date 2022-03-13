
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer first = Integer.valueOf(scanner.nextLine());
        Integer second = Integer.valueOf(scanner.nextLine());

        Integer sum = first + second;

        Double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
