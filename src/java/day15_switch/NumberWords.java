package java.day15_switch;

public class NumberWords {
    public static void main(String[] args) {

        int n = 5;

        switch(n) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

            case 5:
                System.out.println("five");
                break;

            default:
                System.out.println("invalid number");
                break;

        }
    }
}
