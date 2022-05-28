package j.day14_nestedstatements;

public class Pool {
    public static void main(String[] args) {

        boolean result = true;

        if(result){
            System.out.println("B");
        }else{
            System.out.println("A");
        }if(result){
            System.out.println("c");
        }
    }
}
