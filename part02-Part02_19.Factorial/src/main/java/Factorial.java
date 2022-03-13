
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scanner.nextInt();
    
       
        int count =1;
        
        for (int i = 1; i <= num;i++){
            count *= i;
        }
        System.out.println("Factorial: "+ count);
    }
}
