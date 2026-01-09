class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

public class nirajan{
    public static void main(String[] args) {

        Apple ref;   // Parent class reference

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}
