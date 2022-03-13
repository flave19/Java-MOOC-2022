
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int smallest = list.get(0);
        int index = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (current < smallest) {
                smallest = current;
                index = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index " + index);

    }
}
