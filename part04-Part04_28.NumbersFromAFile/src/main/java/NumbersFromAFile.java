import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                list.add(Integer.parseInt(s.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error:");
        }

        for (int i : list) {
            if (i <= upperBound && i >= lowerBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
