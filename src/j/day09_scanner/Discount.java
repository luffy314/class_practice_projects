package j.day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean weekend = true;
        boolean teacher = true;
        boolean policeOfficer = false;
        boolean firefighter = false;

        boolean eligibleForDiscount = weekend && (teacher || policeOfficer || firefighter);

        System.out.println("eligibleForDiscount = " + eligibleForDiscount);




    }
}
