package java.day15_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which floor do u want to go to?\nfloor 1\nfloor 2\nfloor 3\nfloor 4");
        int floor = input.nextInt();
        String message;
        switch(floor){
            case 1:
                message = "floor 1 --> Lobby, starbucks, amazon pick up";
                break;
            case 2:
                message = "floor 2 --> NASA, Cydeo, Discover";
                break;
            case 3:
                message = "floor 3 -->  Uber, Lyft, Chase";
                break;
            case 4:
                message = "floor 4 --> Rooftop, Lounge";
                break;
            default:
                message= "invalid floor selected";
        }
        System.out.println(message);
    }
}
//    Switch Statement Practice
//
//        Hard coded is fine, but improve by using Scanner to get values
//
//        -----------------------------------------------------------
//        add new class Elevator
//
//declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:
//
//        floor 1 --> Lobby, StarBucks, Amazon Pick Up
//        floor 2 --> NASA, Cydeo, Discover
//        floor 3 --> Uber, Lyft, Chase
//        floor 4 --> Rooftop, Lounge
//
//        any other floor value --> Invalid Floor Selected
//
//        -----------------------------------------------------------
//
//        Days In Month (slightly different version than before)
//
//        Write a program that will accept a month name and outputs how many days are in that month
//
//        data:
//
//        February: 28 days
//        April, June, September, November: 30 days
//        January, March, May, July, August, October, December: 31 days
//
//        -----------------------------------------------------------
//
//        Season Finder
//
//        declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
//
//
//        12, 1, 2 	--> Winter
//        3, 4, 5 	--> Spring
//        6, 7, 8 	--> Summer
//        9, 10, 11 	--> Fall
//
//        Ex:
//        2
//        It is winter, so wear a winter coat, gloves and a hat
//
//        -----------------------------------------------------------
//
//        [Author] - Look at Starbucks from class for an idea
//
//        You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
//
//        Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.
//
//        Make variables for all of that information. Given empty defaults for all the variables
//
//        Data based on genre:
//
//        genre - Fantasy
//        page length - 500
//        profit - 1,000,000
//        sequels - 5
//        countries - 50
//
//        genre - Detective
//        page length - 350
//        profit - 700,000
//        sequels - 3
//        countries - 45
//
//        genre - Science Fiction
//        page length - 720
//        profit - 900,500
//        sequels - 4
//        countries - 30
//
//        genre - Short Story
//        page length - 150
//        profit - 300,000
//        sequels - 1
//        countries - 40
//
//        -----------------------------------------------------------
//
//        Ask the user how many days they will stay at the hotel
//        Then ask the user how many people are in their party (how many people are staying in the room)
//
//        Use those two information to determine the price and room type for the hotel based on the below data:
//
//        party size: 1
//        room type: single room
//        price: number of days * 100
//
//        party size: 2
//        room type: double room
//        price: number of days * 125
//
//        party size: 3 or 4
//        room type: large room
//        price: number of days * number of people * 150
//
//        party size: 5, 6, or 7
//        room type: suite
//        price: number of days * 5000
//
//        any other party size:
//        Display one message:
//        Sorry we don't have any available rooms for that size party
//
//        -----------------------------------------------------------