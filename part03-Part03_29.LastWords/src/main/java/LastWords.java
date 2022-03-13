
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.isEmpty()){
            String[] words = input.split(" ");
            int index = words.length-1;
            System.out.println(words[index]);
            input = scanner.nextLine();
        }

    }
}
