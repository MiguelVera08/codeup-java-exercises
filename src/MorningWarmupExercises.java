
import java.util.ArrayList;
import java.util.Arrays;
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
//        ArrayList<String> f = new ArrayList<>();
//        String[] fruits = {"Kiwi","Apple","Grapes","Banana","Guava","Pear"};
//
//
//        for (String fruit : fruits) {
//            f.add(fruit);
//        }
//        System.out.println(f);

//        writeLines();

//        System.out.println(divide(5,3));

//        int[] nums = {1,2,3,4,5};
//
//        System.out.println(Arrays.toString(products(nums)));
        System.out.println(exercise061(60));
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

//    public static void writeLines(){
//
//        String[] data = {"I like to eat apples.","Hey, how are you?","Whats going on?", "Whats up doc?","I go to codeup at 9 am on weekdays."};
//
//
//        for(String s : data){
//            System.out.println(s);
//        }
//    }
//    public static double divide(int divisor, int div) throws ArithmeticException{
//        double quotient = 0.0;
//
//        if(div == 0){
//            throw new ArithmeticException("Error: Attempt to divide by zero.");
//        }
//        quotient = (double) divisor/div;
//        return quotient;
//    }

//    public static int[] products(int[] nums){
//
//        int[] result = new int[nums.length];
//
//        result[nums.length-1]=1;
//        for(int i=nums.length-2; i>=0; i--){
//            result[i]=result[i+1]*nums[i+1];
//        }
//
//        int left=1;
//        for(int i=0; i<nums.length; i++){
//            result[i]=result[i]*left;
//            left = left*nums[i];
//        }
//
//        return result;
//
//    }
    public static ArrayList<Integer> exercise061(int num){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                nums.add(i);
            }
        }
        return nums;
    }
}
