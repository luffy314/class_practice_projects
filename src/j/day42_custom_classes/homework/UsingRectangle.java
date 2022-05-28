package j.day42_custom_classes.homework;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle box=new Rectangle();
        box.base=10;
        box.height=5;
        System.out.println(box);
        box.calculateArea();
        box.calculatePerimeter();
        System.out.println(box);
    }
}
