package programmingConcepts;

/*
What Is a Class?
In the real world, you'll often find many individual objects all of the same kind.
There may be thousands of other bicycles in existence, all of the same make and model.
Each bicycle was built from the same set of blueprints and therefore contains the same components. In object-oriented terms, we say that your bicycle is an instance of the class of objects known as bicycles.
A class is the blueprint from which individual objects are created.
link - https://docs.oracle.com/javase/tutorial/java/concepts/class.html
*/

public class YamahaBicycle_Class implements Bicycle_interface {

    int cadence = 0;
    int speed = 0;
    int gear = 0;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void speedDown(int decrement) {
        speed = speed - decrement;
    }

    void printBicycleState() {
        System.out.println("Speed : " + speed + " | " + "Gear : " + gear + " | " + "Cadence : " + cadence);
    }
}
