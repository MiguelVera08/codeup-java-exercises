public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello, ");
//        System.out.print("World!");

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        byte myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);

        // 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Hello from CodeUp.";
//        System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
//        char myString = 'h';
//        System.out.println(myString);

        // 4. Change your code to assign the value 3.14159 to myString. What happens?
        double myString = 3.14159;
//        System.out.println(myString);

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber =  ;
//        System.out.println(myNumber);

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber);

        // 8. Change your code to assign the value 123 to myNumber.
//        long myNumber = 123;
//        System.out.println(myNumber);

        //9. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        3.14 is a floating number and long type only accepts integers unless you use casting

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14;
//        System.out.println(myNumber);
//      Just change the declaration from float to double or use casting;
//        double myNumber = 3.14;
//        System.out.println(myNumber);

//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//      The first code block is post increment and the second is a pre increment

//        int class = 30; cant create because class is a reserved word.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        An error will occur cannot cast a string into an integer
//        int three = (int) "three";  inconvertible types

//        int x = 4;
//        x = x + 5;
//
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        y*=x;
//

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        x/=y;
//        y-=x;

//        byte number = 128;
//        will not run if numerical variable is larger then the type it will hold

        byte num = 127;

        System.out.println(++num);
//        The variable will be assigned to the opposite sign of the type it can hold.




    }
}
