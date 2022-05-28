package j.day15_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ur browser");
        String browser = input.nextLine();
        System.out.println("enter url");
        String url = input.nextLine();
//        String browser = "firefox";
//        String url = "www.google.com";

        switch (browser) {
            case "chrome":
                System.out.println("opening " + url + " in the chrome browser");
                System.out.println("Loading");
                break;
            case "safari":
                System.out.println("opening " + url + " in the safari browser");
                System.out.println("Loading");
                break;
            case "firefox":
                System.out.println("opening " + url + " in the firefox browser");
                System.out.println("Loading");
                break;
            default:
                System.out.println(browser + " is not a valid browser");


        }
    }
}
