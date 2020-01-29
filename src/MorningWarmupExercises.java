import java.util.Scanner;

public class MorningWarmupExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number: ");
        long counter = scanner.nextLong();

        long count = 0;

        for(int i = 1; i <= counter; i++){
             count += i;
        }
        System.out.print(count);
    }
}
