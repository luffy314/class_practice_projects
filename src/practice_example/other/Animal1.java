package practice_example.other;

public abstract class Animal1 {
    public String name() { return "animal"; }
}

 class Dog extends Animal1 {
    public String name() { return "dog"; }
}

class Testy {
    public static void main(String[] args) {
        Animal1 a= new Dog();
        System.out.println(a.name());

    }
}
