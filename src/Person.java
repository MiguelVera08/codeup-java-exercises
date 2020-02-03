public class Person {
    private String name;

    public Person() {}

    public Person(String name){
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public String sayHello(){

        return String.format("Hello %s!", this.name);
    }


    public static void main(String [] args){
//        Person name1 = new Person("Miguel");
//        System.out.println(name1.sayHello());
//
//        Person name2 = new Person();
//        name2.setName("Jeff");
//        System.out.println(name2.getName());
//        System.out.println(name2.sayHello());


//      Returns true for first print and then false for second print
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//      Returns true because the person2 is getting set to the string of person 1
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


//      Returns John twice then Jane twice
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }



}
