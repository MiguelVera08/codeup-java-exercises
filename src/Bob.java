import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter some text to talk to Bob: ");

            String userInput = scanner.nextLine();


            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }


            System.out.println("Do you want to keep talking to Bob? y/n ");
            String option = scanner.nextLine();

            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Goodbye, until next time.");
                break;
            }
        }
    }
}

