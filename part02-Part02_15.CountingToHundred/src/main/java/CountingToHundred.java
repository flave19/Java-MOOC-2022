
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = num;
        for (int i = 0; count <= 100; i++) {
            System.out.println(count);
            count++;
        }

    }
}
