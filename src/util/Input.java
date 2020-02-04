package util;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Input {

    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);

    }

//    public String getString() {
//        String answer;
////        System.out.println("Enter a string: ");
//        answer = this.scanner.next();
//        return answer;
//
//    }

    public String getString(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer;
    }

//    public boolean yesNo() {
//
//        String confirm = scanner.next();
//
//        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes");
//
//    }

    public boolean yesNo(String prompt){
        String confirm;
        System.out.println(prompt);
        confirm = this.scanner.next();
        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){

       int answer;

       do{
//           System.out.println("Enter a number between " + min + " and " + max +": ");
           System.out.println("\nEnter choice: ");
           answer = this.scanner.nextInt();
           if(answer < min || answer > max) {
               System.out.println("\nInvalid option go again.\n");
           }

       }while (answer < min || answer > max);
       return answer;
    }

//    public int getInt(String prompt, int min, int max){
//        int answer;
//
//        do{
//            System.out.println(prompt);
//            answer = this.scanner.nextInt();
//        }while (answer < min || answer > max);
//        return answer;
//    }

//    public int getInt(){
//
//        int answer;
//        System.out.println("Enter a number: ");
//        answer = this.scanner.nextInt();
//        return  answer;
//    }

    public int getInt(String prompt){

        int answer;
        System.out.println(prompt);
        while (true) {
            try {
                answer = this.scanner.nextInt();
                return answer;
            } catch (NumberFormatException e) {
                System.out.println("\nNot a possible option try again.\n");
            }
        }
    }

    public double getDouble(double min, double max){

        double answer;

        do{
            System.out.println("Enter a number between " + min + " and " + max +": ");
            answer = this.scanner.nextDouble();


        }while (answer < min || answer > max);
        return answer;
    }

//    public double getDouble(String prompt, double min, double max){
//
//        double answer;
//
//        do{
//            System.out.println("Enter a number between " + min + " and " + max +": ");
//            answer = this.scanner.nextDouble();
//
//        }while (answer < min || answer > max);
//        return answer;
//    }

//    public double getDouble(){
//
//        double answer;
//        System.out.println("Enter a number: ");
//        answer = this.scanner.nextDouble();
//        return  answer;
//    }

    public double getDouble(String prompt){
        double answer;
        System.out.println(prompt);
        answer = this.scanner.nextDouble();
        return answer;
    }

}
