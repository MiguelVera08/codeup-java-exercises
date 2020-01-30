//Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
// Test your code by creating a main method and calling each of the methods you've created.

//   1. Basic Arithmetic

//      Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division

//      Each function needs to take two parameters/arguments so that the operation can be performed.

//      Test your methods and verify the output.

//      Add a modulus method that finds the modulus of two numbers.

//      Food for thought: What happens if we try to divide by zero? What should happen?
//      An error is shown saying Exception in thread "main", in math you cannot not divide
//      so an error should be shown.


import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){

        //      Calling the methods     //
//        System.out.println(add(5,2)); //Expected Output: 7
//        System.out.println(subtract(10,5)); //Expected Output: 5
//        System.out.println(multiply(5,20)); //Expected Output: 100
//        System.out.println(division(40,8)); //Expected Output: 5
//        System.out.println(modulus(9,5)); //Expected Output: 4
//
//        //      Bonus       //
//        System.out.println(multiplyLoop(5, 6)); //Expected Output: 30
//        System.out.println(multiplyRecursion(5, 6)); //Expected Output: 30


//        What happens if we try to divide by zero?
//        System.out.println(division(10,0));


        System.out.println(getInteger(1, 30));


//      Factorial Game      //
        factorial();


//       Dice rolling  call     //
        diceRoll();

    }







    //    Basic Arithmetic      //


    //    Addition Method      //
    public static long  add(long x, long y){

        return x + y;

    }

    //    Subtraction Method      //
    public static long subtract(long x, long y){

        return x - y;

    }

    //    Multiplication Method     //
    public static long multiply(long x, long y){

        return x * y;

    }

    //      Division Method     //
    public static long division(long x, long y){

        return x / y;

    }

    //      Modulus Method      //
    public static long modulus(long x, long y){

        return x % y;

    }


//     Bonus

//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
    public static long multiplyLoop(long x, long y){
        long result = 0;
        for(long i = 0; i < x; i++){
            result += y;
        }
        return result;
    }

//        Do the above with recursion.
    public static long multiplyRecursion(long x, long y){
        if((x == 0) || (y == 0)){
            return 0;
        }else{
            return (x + multiplyRecursion(x, y - 1));
        }
    }


// 2. Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);

//    and is used like this:

//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);


//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!

    public static int getInteger(int min, int max){

        System.out.print("\nEnter a number between " + min + " and " + max + ": ");

        int userInput = scanner.nextInt();

        if( userInput < min || userInput > max){
            System.out.print("\nNumber is not within range go again.");
            return getInteger(min, max);
        }else{
            System.out.print("\nHere is your number you entered: ");
            return userInput;
        }
    }

//    Calculate the factorial of a number.
//
//      Prompt the user to enter an integer from 1 to 10.

//      Display the factorial of the number entered by the user.

//      Ask if the user wants to continue.

//      Use a for loop to calculate the factorial.

//      Assume that the user will enter an integer, but verify it’s between 1 and 10.

//      Use the long type to store the factorial.

//      Continue only if the user agrees to.

//      A factorial is a number multiplied by each of the numbers before it.

//      Factorials are denoted by the exclamation point (n!). Ex:

//           1! = 1               = 1
//           2! = 1 x 2           = 2
//           3! = 1 x 2 x 3       = 6
//           4! = 1 x 2 x 3 x 4   = 24

public static void factorial() {
    do {
        System.out.println("\nEnter a number between 1 and 10: \n");
        int userNumb = scanner.nextInt();



        if(userNumb < 1 || userNumb > 10 ){
            System.out.print("\nNumber is not within range go again.\n");
            factorial();
        }else {
            String details = "";
            long factorial = 1;
            for (long i = 1; i <= userNumb; i++) {
                details += ( i == 1 ) ? i : " x " + i;
                factorial = factorial * i;
                System.out.println(i +"! = " + details + " = " + (factorial));
            }


            System.out.println("\nDo you want to continue? [y/n] ");
        }


        String option = scanner.next();
        if (!option.equalsIgnoreCase("y")) {
            System.out.println("Goodbye...\n");
            break;
        }
    }while (true);
}



//    }


//4. Create an application that simulates dice rolling.

//      Ask the user to enter the number of sides for a pair of dice.
//      Prompt the user to roll the dice.
//      "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//      Use static methods to implement the method(s) that generate the random numbers.
//      Use the .random method of the java.lang.Math class to generate random numbers.


//    Method to get the random roll on dice     //
    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }

    //      Method that ask the user How many sides on the dice and how many dice they want to roll     //
    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("How many sides on the dice?");
            int sides = scanner.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = scanner.nextInt();
            diceRoll(sides, numDice);
            scanner.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = scanner.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Goodbye!");
                keepGoing = false;
            }
        }


    }
}
