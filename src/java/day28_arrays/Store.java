package java.day28_arrays;

public class Store {
    public static void main(String[] args) {

        String[] items = {"shoes", "jackets", "gloves", "airpods", "ipad"};

        boolean hasJacket = false;
        for(int i =0;i<items.length;i++){
            if(items[i].equalsIgnoreCase("jackets")){
                hasJacket= true;
                break;
            }

            }
        System.out.println(hasJacket);
        }
}
