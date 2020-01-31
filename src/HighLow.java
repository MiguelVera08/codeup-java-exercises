import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class HighLow {
    public static void main(String[] args){
        highLow();

    }

    public static void highLow() {
        System.out.println("Guess a number between 1 and 100: ");
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        double count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            if(guessNum < numberToGuess){
                System.out.println("HIGHER");
                count++;
            }
            else if(guessNum > numberToGuess){
                System.out.println("LOWER");
                count++;
            }
            else if(guessNum == numberToGuess){
                System.out.printf("CORRECT! It took you %.0f guesses!", count);
                break;
            }
        }while(true);
    }
}
