package java.day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("how many friends u have?");
        int num = input.nextInt();

        String [] friend = new String[num];

        for(int i=0; i<friend.length;i++){
            System.out.println("enter friends name");

            friend[i]=input.next();

        }
        System.out.println(Arrays.toString(friend));






    }
}
