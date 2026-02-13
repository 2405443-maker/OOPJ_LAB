// Interface
interface Motor {

    // Data member (public static final by default)
    int capacity = 1500;

    // Abstract methods
    void run();
    void consume();
}

// Class implementing interface
class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Washing machine motor is running.");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine consumes electricity and water.");
    }

    // Method to display capacity
    void showCapacity() {
        System.out.println("Motor Capacity: " + capacity);
    }
}

// Driver class
public class Nirajan{
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Accessing interface data member through object
        System.out.println("Accessing capacity through object: " + wm.capacity);

        // Accessing through interface
        System.out.println("Accessing capacity through interface: " + Motor.capacity);
    }
}


