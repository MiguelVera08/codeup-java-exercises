package grades;

import java.util.ArrayList;

public class Student {

    //Properties
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grades) {

        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grades);

    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){

        this.grades.add(grade);

    }

    public double getGradeAverage(){

        double sum = 0;
        for (Integer grade : grades) {

            sum += grade;
        }

        return sum/grades.size();

    }


    /*-- Testing Student class --*/
//    public static void main(String[] args) {
//
//        Student student1 = new Student("Miguel",55);
//
//        student1.addGrade(67);
//        System.out.println(student1.getGradeAverage());
//
//    }


}
