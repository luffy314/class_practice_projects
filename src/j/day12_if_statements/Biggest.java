package j.day12_if_statements;

public class Biggest {
    public static void main(String[] args) {

        int x= 5, y=7, z=9;
        boolean greater = x>=5 && x>=z;
        boolean greater2 = y>=z;

        if (greater){
            System.out.println(x + " is biggest");

        }else if (greater2){
            System.out.println(y+ " is biggest");
        }else{
            System.out.println(z + " is greatest");
        }

    }
}
