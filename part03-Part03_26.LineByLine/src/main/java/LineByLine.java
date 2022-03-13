
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        while (!sentence.isEmpty()) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
            sentence = scanner.nextLine();
        }
    }
}
