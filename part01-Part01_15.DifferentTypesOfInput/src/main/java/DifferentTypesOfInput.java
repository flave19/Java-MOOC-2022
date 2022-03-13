
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();

        System.out.println("Give an integer:");
        Integer integer = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double dub = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean trueOrFalse = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + trueOrFalse);

    }
}
