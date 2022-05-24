package java.day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("address");
        String address = input.nextLine();

        System.out.println("name of owner");
        String ownerName = input.nextLine();

        System.out.println("number of units");
        int numUnits = input.nextInt();

        System.out.println("average size of each unit");
        double unitSize = input.nextInt();

        System.out.println("monthly rent amount");
        double rent = input.nextInt();

        System.out.println("number of washers and driers");
        int numWashersDriers = input.nextInt();

        System.out.println("allow pets");
        boolean pets = input.nextBoolean();

        System.out.println("has a pool");
        boolean pool = input.nextBoolean();

        System.out.println("length of lease");
        int leaseLength = input.nextInt();

        System.out.println("total number of resident in building");
        int totalPeople = input.nextInt();

        System.out.println("phone number of owner");
        String ownerNumber = input.next();

        System.out.println("near gas station");
        boolean gasStationNear = input.nextBoolean();

        System.out.println("number of floors");
        int numberOfFloors = input.nextInt();

        System.out.println("has a basement");
        boolean basement = input.nextBoolean();

        System.out.println("has available units for rent");
        boolean availableUnits = input.nextBoolean();

        System.out.println("has air conditioning");
        boolean ac = input.nextBoolean();

        System.out.println("number of parking spaces");
        int numParkingSpots = input.nextInt();

        System.out.println("has wheel chair access");
        boolean wheelChairAccess = input.nextBoolean();

        System.out.println("number of review stars");
        int numberOFStars = input.nextInt();

        double monthlyRentAfter3Year= (rent * 0.9);
        double monthlyRentAfter6Years= (rent * 0.8);
        int averageResidentsPerUnit = totalPeople/numUnits;
        int averageParkingPerUnit = numParkingSpots/numUnits;
        int averageUnitsPerFloor = numUnits/numberOfFloors;

        System.out.println("monthlyRentAfter3Year = " + monthlyRentAfter3Year);
        System.out.println("monthlyRentAfter6Years = " + monthlyRentAfter6Years);
        System.out.println("averageResidentsPerUnit = " + averageResidentsPerUnit);
        System.out.println("averageParkingPerUnit = " + averageParkingPerUnit);
        System.out.println("averageUnitsPerFloor = " + averageUnitsPerFloor);


//        Create the variables with the most appropriate datatype:
//
//        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)
//
//                - Create these variables and use previous variables to get the values
//
//        - monthly rent after 3 years (discount 10% off original rent)
//                - monthly rent after 6 years (discount 20% off original rent)
//                - Average number of residents per unit (total residents / number of units)
//                - Average number of parking spots per unit ( parking spots / units)
//        - Average number of units per floor ( units / number of floors)


    }
}
