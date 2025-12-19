import java.util.Scanner;

// Box class
class Box {
    double length, width, height;

    // method to calculate volume
    double volume() {
        return length * width * height;
    }
}

// Application class
public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        // printing volume
        System.out.println("Volume = " + b.volume());

        sc.close();
    }
}
