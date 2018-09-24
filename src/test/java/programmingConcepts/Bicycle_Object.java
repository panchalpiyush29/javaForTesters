package programmingConcepts;


/*
Object is an instance of a class
Real-world objects share two characteristics: They all have state and behavior. Dogs have state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail).
An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages).
Methods operate on an object's internal state and serve as the primary mechanism for object-to-object communication.
Hiding internal state and requiring all interaction to be performed through an object's methods is known as data encapsulation — a fundamental principle of object-oriented programming.
Link - https://docs.oracle.com/javase/tutorial/java/concepts/object.html
*/
public class Bicycle_Object {

    public static void main(String[] args) {

        //Create two different bicycle objects
        YamahaBicycle_Class bike1 = new YamahaBicycle_Class();
        YamahaBicycle_Class bike2 = new YamahaBicycle_Class();
        MountainBike_Inheritance bike3 = new MountainBike_Inheritance();

        //use methods to change object state and behaviour
        bike1.changeGear(3);
        bike1.speedUp(60);
        bike1.speedDown(10);
        bike1.changeGear(2);
        bike1.changeCadence(1500);
        bike1.printBicycleState();

        bike2.changeGear(2);
        bike2.speedUp(20);
        bike2.changeGear(3);
        bike2.speedUp(50);
        bike1.changeCadence(1800);
        bike2.printBicycleState();

        bike3.changeColour("Red");
        bike3.changeGear(3);
        bike3.speedUp(60);
        bike1.changeCadence(1600);
        bike3.printMountainBike();
    }
}