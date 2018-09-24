package programmingConcepts;

/*
Different kinds of objects often have a certain amount in common with each other.
Mountain bikes, road bikes, and tandem bikes, for example, all share the characteristics of bicycles
Object-oriented programming allows classes to inherit commonly used state and behavior from other classes.

*/
public class MountainBike_Inheritance extends YamahaBicycle_Class {
    String colour;

    void changeColour(String newValue) {
        colour = newValue;
    }

    void printMountainBike() {
        System.out.println("Speed : " + speed + " | " + "Gear : " + gear + " | " + "Cadence : " + cadence + " | " + "Colour : " + colour);
    }

}

/*
This gives MountainBike all the same fields and methods as Bicycle_interface, yet allows its code to focus exclusively on the features that make it unique.
*/
