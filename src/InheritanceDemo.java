import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Plate Constructor ---");
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }
}

class Box extends Plate {
    double height;

    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Box Constructor ---");
        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }

    double volume() {
        return length * width * height;
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- WoodBox Constructor ---");
        System.out.print("Enter Thickness: ");
        thick = sc.nextDouble();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox();
        System.out.println("Volume = " + wb.volume());
    }
}
