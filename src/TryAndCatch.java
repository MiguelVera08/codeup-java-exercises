public class TryAndCatch {

    public static void main(String[] args){
        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
        }
    }
}
