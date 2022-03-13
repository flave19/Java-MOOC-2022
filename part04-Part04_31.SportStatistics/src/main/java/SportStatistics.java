import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int wins = 0;
        int losses = 0;
        try (Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String row = s.nextLine();

                String[] split = row.split(",");
                String home = split[0];
                String away = split[1];
                int hpoints = Integer.parseInt(split[2]);
                int apoints = Integer.parseInt(split[3]);

                if (home.equals(team) && hpoints > apoints || away.equals(team) && hpoints < apoints) {
                    wins++;
                } else if (home.equals(team) || away.equals(team)) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

        int games = wins + losses;
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }
}
