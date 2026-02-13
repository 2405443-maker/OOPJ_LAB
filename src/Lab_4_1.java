import java.util.Scanner;

// Abstract class
abstract class student {
    int rollNo;
    int regNo;

    // Method to take input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Registration No: ");
        regNo = sc.nextInt();
    }

    // Abstract method
    abstract void course();
}

// Subclass
class kiitian extends student {

    // Implementation of abstract method
    @Override
    void course() {
        System.out.println("Course: B.Tech in Computer Science");
    }

    // Method to display details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
    }
}

// Driver class
public class Lab_4_1 {
    public static void main(String[] args) {

        kiitian k = new Kiitian();

        k.getInput();   // Input details
        k.display();    // Display details
        k.course();     // Display course
    }
}
