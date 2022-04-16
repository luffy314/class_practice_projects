package day45_custom_classes;

public class Student {
      /*
     ======= Task 1 ======= (Parameterized vs No Arg  Constructor |  Chaining | Overloading | This() )
           className --- > Student
           				instance variables:
                    					name, age, batchNumber

                    	1st constructor: initializes the name ONLY

                    	2nd constructor: initializes name & age
           							(MUST apply constructor Call)

                    	3rd Constructor: initializes name, age ,batchNumber
           							(MUST apply constructor Call)

                    			instance methods: toString()
     */


    String name;
    int age,batchNumber;


    public Student(String name){
        this.name=name;
        joinClass(name);
    }

    public Student(String name,int age){
        this(name);
        //this.name=name;
        this.age=age;

    }
    public Student(String name, int age, int batchNumber) {    // Full Arg Constructor
        this(name,age);
        //this.name = name;
        //this.age = age;
        this.batchNumber = batchNumber;
    }

    public void joinClass(String name){
        // this(name); We cant call constr from method with this ()  COMPILER ERROR
        System.out.println(name + " is joining the classes");

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
