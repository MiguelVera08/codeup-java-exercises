package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    static Input userInput = new Input();

    public static void main(String[] args){


        /*--Student Objects--*/
        Student Miguel = new Student("Miguel", 85);
        Miguel.addGrade(95);
        Miguel.addGrade(84);

        Student Crystal = new Student("Crystal", 95);
        Crystal.addGrade(86);
        Crystal.addGrade(98);

        Student Matt = new Student("Matt",  87);
        Matt.addGrade(99);
        Matt.addGrade(89);

        Student Jena = new Student("Jena", 89);
        Jena.addGrade(99);
        Jena.addGrade(100);



        /*--Set the key value pairs --*/
        students.put("MiguelVera08", Miguel);
        students.put("crystalthibodeau", Crystal);
        students.put("MathewHettler", Matt);
        students.put("JenaBurk7890", Jena);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");



        displayInfo();



    }


    public static void displayInfo(){

        for (String key : students.keySet()) {

            System.out.print("|" + key + "| ");

        }
        System.out.println("\n");


        //Ask the user which username they wish to see more info on.
        String userName = userInput.getString("Which student would you like to see more information on? ");

        if(!students.containsKey(userName)){

            System.out.println("\nSorry, no student found with the Github username of \"" + userName + "\"");

            boolean confirm = userInput.yesNo("Would you like to see another student?");
            if(confirm){
                displayInfo();
            }else{
                System.out.println("Goodbye, and have a wonderful day!");
            }
        }else if(students.containsKey(userName)){

            System.out.printf("Name: %S - GitHub Username: %s  \nCurrent Average: %.2f\n", students.get(userName).getName(), userName, students.get(userName).getGradeAverage());
            boolean confirm = userInput.yesNo("\nWould you like to see another student?");
            if(confirm){
                displayInfo();
            }else{
                System.out.println("\nGoodbye, and have a wonderful day!");
            }
        }
    }
}
