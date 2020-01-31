import java.util.Scanner;

public class MorningWarmupExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(multiply(5, 4));




//        System.out.println("Enter a number: ");
        long counter = scanner.nextLong();

        long count = 0;

        for(int i = 1; i <= counter; i++){
             count += i;
        }
//        System.out.print(count);

//        System.out.println(cube(3));


    }

    public static long cube(int num){

        return num * num * num;
    }

    public static long multiply(long x, long y){
        long result = 0;
        for(long i = 0; i < x; i++){
            result += y;
        }
        return result;
    }

}
