
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int greatest = 0;

        while(!input.isEmpty()){
            String[] nameAndAges = input.split(",");
            for(int i = 1;i < nameAndAges.length; i=i+2 ){
                if(Integer.valueOf(nameAndAges[i])> greatest){
                    greatest = Integer.valueOf(nameAndAges[i]);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + greatest);
    }
}
