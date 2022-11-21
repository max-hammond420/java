import java.util.Random;
import java.util.Scanner;

public class GuessingGame{

    public static void main(String[] args){

        Random random = new Random();
        int numberToGuess = random.nextInt(20) + 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Guess what number it is: ");

        while(true){
            int n = scan.nextInt();
            if(n == numberToGuess){
                System.out.println("Correct!");
                break;
            }
            System.out.print("Incorrect guess, try again: ");
        }
    }
}
