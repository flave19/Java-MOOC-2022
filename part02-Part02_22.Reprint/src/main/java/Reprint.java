
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {

        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for (int i = 0 ; i < num ; i ++){
            printText();
        }
        
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
