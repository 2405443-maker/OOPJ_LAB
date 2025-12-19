import java.util.Scanner;

class MyClass {
    // static variable to count objects
    static int count = 0;

    // constructor
    MyClass() {
        count++;
    }
}

public class ObjectCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        // creating objects
        for (int i = 0; i < n; i++) {
            new MyClass();
        }

        // displaying result
        System.out.println("Number of objects = " + MyClass.count);

        sc.close();
    }
}
