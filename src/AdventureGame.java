import java.util.Scanner;


public class AdventureGame {
    public static Scanner scanner = new Scanner(System.in);
    public static String playerName;
    public static int playerhp;
    public static int maxhp;
    public static int maxmana;
    public static int mana;
    public static int playermeleedmg;
    public static int xp;
    public static int enemyhp;
    public static int enemymeleedmg;
    public static int Level;
    public static String charclass;

    private static void printStats() {
        if(charclass.equals("mage")){
            System.out.println(playerName + "\nhp: " + playerhp + "\nmana: " + mana + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");
        }else{
            System.out.println(playerName + "\nhp: " + playerhp + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");
        }
    }

    private static void buildWarrior() {
        charclass = "warrior";
        maxhp = 20;
        playerhp = 20;
        playermeleedmg = 4;
        xp = 0;
        Level = 1;
    }
    private static void buildArcher() {
        charclass = "archer";
        maxhp = 14;
        playerhp = 14;
        playermeleedmg = 6;
        xp = 0;
        Level = 1;
    }
    private static void buildMage() {
        charclass = "mage";
        maxhp = 10;
        playerhp = 10;
        mana = 20;
        maxmana = 20;
        playermeleedmg = 2;
        xp = 0;
        Level = 1; // initializes globals according to class
    }
    public static void main(String[] args){

        String charclass;
        int num = 2;
        while(true) {
            System.out.println("Enter your Name: ");
            playerName = scanner.nextLine();
            System.out.println("Choose your class: ");
            System.out.println("'w' for warrior");
            System.out.println("'a' for archer");
            System.out.println("'m' for mage");
            charclass = scanner.nextLine();
            while (charclass.charAt(0) != 'w' && charclass.charAt(0) != 'a' && charclass.charAt(0) != 'm') {
                System.out.println("'w' for warrior");
                System.out.println("'a' for archer");
                System.out.println("'m' for mage");
                charclass = scanner.nextLine();
            }
            if (charclass.charAt(0) == 'w') {
                buildWarrior();
            }
            if (charclass.charAt(0) == 'a') {
                buildArcher();
            }
            if (charclass.charAt(0) == 'm') {
                buildMage();
            }
            printStats();

        }

    }

}
