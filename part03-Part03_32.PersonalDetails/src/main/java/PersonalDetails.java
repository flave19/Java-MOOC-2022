
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String longestName = "";
        int years = 0;
        int count = 0;

        while (!input.isEmpty()) {
            String[] nameAndAges = input.split(",");
            if (nameAndAges[0].length() > longestName.length()) {
                longestName = nameAndAges[0];
            }
            years += Integer.valueOf(nameAndAges[1]);
            count++;
            input = scanner.nextLine();
        }
        double avg = (double) years / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
