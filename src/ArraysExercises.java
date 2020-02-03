import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person human){

        people = Arrays.copyOf(people, people.length+1);
        people[people.length - 1] = human;
        return people;

    }


    public static void main(String [] args){

//        What happens when you run the following code?
//        Why is Arrays.toString necessary?



        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers )+ "\n");

//        Create an array that holds 3 Person objects.
//        Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.

        Person[] people = new Person[3];

        people[0] = new Person("Mike");
        people[1] = new Person("Tanya");
        people[2] = new Person("Max");


        Person holly = new Person("Holly");

        for(Person person: people){

            System.out.println(person.getName());

        }
        System.out.println("\n");

        people = addPerson(people, holly);

        for (Person person: people){
            System.out.println(person.getName());
        }

    }
}
