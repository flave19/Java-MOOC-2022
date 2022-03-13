
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int oldestAge = 0;
        String oldestName ="";

        while(!input.isEmpty()){
            String[] nameAndAges = input.split(",");
            for(int i = 1;i < nameAndAges.length; i=i+2 ){
                if(Integer.valueOf(nameAndAges[i])> oldestAge){
                    oldestAge = Integer.valueOf(nameAndAges[i]);
                    oldestName = nameAndAges[i-1];
                }
            }
            input = scanner.nextLine();
        }
        
        System.out.println("Name of the oldest: " + oldestName);

    }
}
