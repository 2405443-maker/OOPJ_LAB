import java.util.Scanner;

class Rectangle {
    double length, breadth;
    double area, perimeter;

    // Constructor with parameters
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to read values (optional if constructor is used)
    void read(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display result
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

public class Rec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Creating object using constructor
        Rectangle r = new Rectangle(l, b);

        r.calculate();
        r.display();

        sc.close();
    }
}
