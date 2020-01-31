import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[]  args){

        Scanner scanner = new Scanner(System.in);


        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f", pi );


//        1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//         What happens if you input something that is not an integer? You get an error


//
//       System.out.print("\nEnter an Integer: ");
//       long number = scanner.nextInt();
//
//       System.out.println("You entered: \"" + number + "\" ");

//        2.Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//                What happens if you enter less than 3 words? Only the words typed get displayed.
//                What happens if you enter more than 3 words? Displays the first three words.


//
//        System.out.print("\nEnter three words: ");
//
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.println("Here's all three words entered: \n" + firstWord + "\n"+ secondWord + "\n" + thirdWord);

//        3.Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all of the words? No only the first word was caught

//
//
//        System.out.print("\nEnter a sentence: ");
//
//        String sentence = scanner.next();
//
//        System.out.println("Here's your sentence: " + sentence + ".");

//       4.Rewrite the above example using the nextLine method.

//
//
//        System.out.print("\nEnter a sentence: ");
//
//        String sentence = scanner.nextLine();
//
//        System.out.println("Here's your sentence: " + sentence + ".");


//        Calculate the perimeter and area of Codeup's classrooms.
//
//        1. Prompt the user to enter values of length and width of a classroom at Codeup.
//
//           Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.


        scanner.useDelimiter("\n");
        System.out.print("\nEnter Length : ");

        double length = scanner.nextFloat();

        System.out.print("Enter width: ");

        double width = scanner.nextFloat();

////        variables for area and perimeter
//        double perimeter = (float) (length * 2 + width * 2);
//        double area = (float) (length * width);


        System.out.printf("The perimeter of the room: %f.2", length,width, 2*(length + width));
        System.out.printf("The area of the room: %f.2", length,width, length*width);







    }
}
