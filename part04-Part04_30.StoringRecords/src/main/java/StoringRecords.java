
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String row = s.nextLine();
                String[] split = row.split(",");
                persons.add(new Person(split[0], Integer.parseInt(split[1])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return persons;

    }
}
