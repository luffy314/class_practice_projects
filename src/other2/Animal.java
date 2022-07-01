package other2;

class Animal {
    static void print() {
        System.out.print("Animal");
    }
}

class Dog extends Animal {
int a;
    public Dog() {
        swim();
        this.swim();
        a=7;;
        System.out.println(7);
    }

    static void print() {
        System.out.println("Dog");
    }
    void swim(){
        System.out.println("child swim");
        shoot();
        a=4;
    }
    void shoot(){
        System.out.println("child shoot");

    }
    void eat(){
        System.out.println("child eat");
        this.shoot();//u can either use this keyword or just call the instance method by itself or instance variable as well, un;ess we bring in local variables
    }
}

class Test4 {
    public static void main(String[] args) {


        Animal a1 = new Animal();
        a1.print();

        Animal d = new Dog();
        d.print();

        Animal a2 = null;
        a2.print();//shows that ur not really using class object to call static method since object is null....i think, i could be wrong

        System.out.println("------");

        Animal e = new Dog();

        System.out.println("------");
        Dog one =new Dog();

    }
}