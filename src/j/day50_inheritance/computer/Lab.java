package j.day50_inheritance.computer;

public class Lab {
    public static void main(String[] args) {

        Computer obj1 = new Computer("generic os", 300);
        System.out.println(obj1);

        Windows obj2 = new Windows(500);
        //             new Computer("Windows", 500)
        System.out.println(obj2);

        Mac obj3=new Mac(300);
        System.out.println(obj3);








    }
}

/*
version when you accept both os and memory
Mac obj3 = new Mac("Mac", 300);
new Mac("Mac", 300);
new Mac("Mac", 200);
new Mac("Mac", 1000);
new Mac("Mac", 400);

 */
