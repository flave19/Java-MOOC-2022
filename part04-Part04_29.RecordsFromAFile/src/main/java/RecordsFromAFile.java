import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String row = s.nextLine();
                String[] split = row.split(",");
                String yearFormat = "years";
                if (Integer.parseInt(split[1]) == 1) {
                    yearFormat = "year";
                }
                System.out.println(split[0] + ", age: " + split[1] + " " + yearFormat);
            }
        } catch (Exception e) {
            System.out.println("Error:");
        }

    }
}
