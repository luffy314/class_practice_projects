package j.day29_arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 299.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };


//         print the catalog

        for(int i = 0; i < items.length; i++) {

            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }

        int indexOfGloves = -1; // we set -1 as the default, so that if gloves is not found in the array it will always give -1

        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("gloves")){
                indexOfGloves = i;
                break;
            }
        }

        System.out.println("Index of gloves " + indexOfGloves);

        System.out.println();

        double mostExpensive = prices[0];
        int indexOfMostExpensive = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > mostExpensive){
                mostExpensive = prices[i];
                indexOfMostExpensive = i;
            }
        }

        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMostExpensive]);
        System.out.println("Price $" + prices[indexOfMostExpensive]);




    }
}
