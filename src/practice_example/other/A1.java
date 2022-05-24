package practice_example.other;

class A1 {
    public static void display() {
        System.out.println("Inside static method of superclass");
    }
}

class B1 extends A1 {
    public void show() {
        display();
    }

    public static void display() {
        System.out.println("Inside static method of this class");
    }
}

class Test {
    public static void main(String[] args) {
        B1 b1 = new B1();
        // prints: Inside static method of this class
        b1.display();

        A1 a = new B1();
        // prints: Inside static method of superclass
        a.display();
    }
}
