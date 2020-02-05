package Inherit;

public class InheritTest {

    public static void main(String[] args){

        Grandparent obj0 = new Grandparent();
        Parent obj1 = new Parent();
        ParentTwo obj2 = new ParentTwo();
        GrandChild obj3 = new GrandChild();

        obj0.methodA();
        obj1.methodB();
        obj2.methodC();
        obj3.methodD();
    }
}
