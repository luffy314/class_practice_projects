package j.day11_if_statements;

import java.util.Scanner;

public class day12_coding {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("give a number");
        int dayOfWeek = input.nextInt();

        if (dayOfWeek==1){
            System.out.println("it's monday");
        }else if (dayOfWeek==2){
            System.out.println("Its Tuesday");
        } else if (dayOfWeek== 3){
            System.out.println("Its Wednesday");
        }else if (dayOfWeek == 4){
            System.out.println("Its Thursday");
        }else if (dayOfWeek== 5){
            System.out.println("Its Friday");
        }else if(dayOfWeek == 6){
            System.out.println("Its Saturday");
        }else if (dayOfWeek == 7){
            System.out.println("Its Sunday");
        }else{
            System.out.println("Invalid Enter");
        }
    }
}
