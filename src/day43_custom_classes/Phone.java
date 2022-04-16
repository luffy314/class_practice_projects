package day43_custom_classes;

public class Phone {
 /*

        create instance variables

            name, brand, memory, version

        create constructors

        - accept and initialize the name

        - accept and initialize the name and brand

        - accept and initialize the name, brand, memory, and version

        create a toString
     */

    String name;
    String brand;
    int memory;
    double version;

    public Phone(String str) {
        name=str;   //this was works as well if u don't want to use this keyword
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }
}
