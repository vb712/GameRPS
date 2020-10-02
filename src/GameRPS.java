		import java.util.Scanner;

public class GameRPS {

    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock Paper Scissors game in Java!");
        do {
            System.out.println("To Play Type Rock Or Paper Or Scissors");
            String ansp = sc.nextLine();
            if (ansp.equalsIgnoreCase("Rock")) {
                System.out.println("...");
            } else if (ansp.equalsIgnoreCase("Paper")) {
                System.out.println("...");
            } else if (ansp.equalsIgnoreCase("Scissors")) {
                System.out.println("...");
            } else {
                System.out.println("Error type Rock or Paper Or Scissors");
                System.exit(0);
            }
            System.out.println("You Choose :" + ansp);
            int rand = (int) Math.random() * 2;
            if (rand == 0) {
                System.out.println("Computer chose : Rock");
            } else if (rand == 1) {
                System.out.println("Computer chose : Paper");
            } else if (rand == 2) {
                System.out.println("Computer chose : Scissors");
            }
            if (rand == 0 && ansp.equalsIgnoreCase("Rock")) {
                System.out.println("Draw!");
                x++;
            } else if (rand == 0 && ansp.equalsIgnoreCase("Paper")) {
                System.out.println("You Won!");
                x++;
            } else if (rand == 0 && ansp.equalsIgnoreCase("Scissors")) {
                System.out.println("Computer Won!");
                x++;
            } else if (rand == 1 && ansp.equalsIgnoreCase("Rock")) {
                System.out.println("Computer Won!");
                x++;
            } else if (rand == 1 && ansp.equals("Paper")) {
                System.out.println("Draw");
                x++;
            } else if (rand == 1 && ansp.equalsIgnoreCase("Scissors")) {
                System.out.println("You Won!");
                x++;
            } else if (rand == 2 && ansp.equalsIgnoreCase("Rock")) {
                System.out.println("You Won!");
                x++;
            } else if (rand == 2 && ansp.equalsIgnoreCase("Paper")) {
                System.out.println("Computer Won!");
                x++;
            } else if (rand == 2 && ansp.equalsIgnoreCase("Scissors")) {
                System.out.println("Draw!");
                x++;
            }
        } while (x < 6);
    }
}
