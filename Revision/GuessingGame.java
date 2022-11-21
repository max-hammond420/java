import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20) + 1;
        int guess = 0;
        int tries = 0;

        Scanner scan = new Scanner(System.in);
        while (guess != number) {
            System.out.println("Guess a number between 1 and 20: ");
            String strGuess = scan.nextLine();
            guess = Integer.parseInt(strGuess);
            tries++;
            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            }
        }
        System.out.println("You got it in " + tries + " tries!");
        scan.close();
    }
}
