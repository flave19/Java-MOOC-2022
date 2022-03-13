
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                names.add(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println("");

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        Boolean check = names.stream().anyMatch(name -> name.contains(searchedFor));

        if(check){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
    }
}
