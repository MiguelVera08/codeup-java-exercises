package inheritance;

public class InheritanceTest {
    public static void main(String[] args){

        Vehicle[] garage = new Vehicle[4];


        Vehicle vehicle1 = new Vehicle(5);
//        vehicle1.go();
//        vehicle1.report();
        garage[0] = vehicle1;


        Vehicle car1 = new Car();
//        car1.go();
//        car1.report();
        garage[1] = car1;

        Vehicle truck1 = new Truck();
//        truck1.go();
//        truck1.report();
        garage[2] = truck1;

        Vehicle motorcycle1 = new Motorcycle();
//        motorcycle1.go();
//        motorcycle1.report();
        garage[3] = motorcycle1;

        System.out.println(garage);
        for (Vehicle veh : garage){
            veh.go();
            veh.report();
            if(veh instanceof Vehicle){
                System.out.println("Of course I'm a vehicle");
            }
            if(veh instanceof Car){
                System.out.println("I am a car!!");
            }
//            if(veh instanceof Truck){
//                System.out.println("");
//            }
        }

    }
}
