import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed?");
        String info = scanner.nextLine();

        for (Book book : books) {
            if (info.equals("everything")) {
                System.out.println(book.toString());
            }
            if (info.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
