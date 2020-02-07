
import java.util.ArrayList;
import java.util.Scanner;


public class MorningWarmupExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        System.out.println(multiply(5, 4));
//        System.out.println(addBinary("10", "11"));



//        System.out.println("Enter a number: ");
//        long counter = scanner.nextLong();
//
//        long count = 0;
//
//        for(int i = 1; i <= counter; i++){
//             count += i;
//        }
//        System.out.print(count);

//        System.out.println(cube(3));
        ArrayList<String> f = new ArrayList<>();
        String[] fruits = {"Kiwi","Apple","Grapes","Banana","Guava","Pear"};


        for (String fruit : fruits) {
            f.add(fruit);
        }
        System.out.println(f);


    }

//    public static long cube(int num){
//
//        return num * num * num;
//    }

//    public static long multiply(long x, long y){
//        long result = 0;
//        for(long i = 0; i < x; i++){
//            result += y;
//        }
//        return result;
//    }

//    public static String addBinary(String input0, String input1){
//
//        int numberOne = Integer.parseInt(input0, 2);
//        int numberTwo = Integer.parseInt(input1, 2);
//
//        int sum = numberOne + numberTwo;
//
//        return Integer.toBinaryString(sum);
//    }
}
