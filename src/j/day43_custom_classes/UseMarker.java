package j.day43_custom_classes;

public class UseMarker {
    public static void main(String[] args) {
        Marker marker1 = new Marker("Dry Erase", "Expo", "Red");
        System.out.println(marker1);

        /*

        Before
        Marker marker = new Marker();
        marker.type = "Dry Erase";
        marker.brand = "Expo";
        marker.color = "Red";


         */

    }
}
