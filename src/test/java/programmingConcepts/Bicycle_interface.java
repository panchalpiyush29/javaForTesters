package programmingConcepts;


/*
In its most common form, an interface is a group of related methods with empty bodies.
A bicycle's behavior, if specified as an interface, might appear as follows:
*/

public interface Bicycle_interface {
    //wheel revolution per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void speedDown(int decrement);
}

/*
As you've already learned, objects define their interaction with the outside world through the methods that they expose.
Methods form the object's interface with the outside world; the buttons on the front of your television set,
for example, are the interface between you and the electrical wiring on the other side of its plastic casing.
You press the "power" button to turn the television on and off.

Implementing an interface allows a class to become more formal about the behavior it promises to provide.
Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.
If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

*/