package practice_solutions.entertainment;

public class GetEntertained {
    public static void main(String[] args) {

        // This is a runner class to interact with the objects of the concrete classes

        NetflixShow netflix = new NetflixShow(60,"Breaking Bad", 5, 2);

        System.out.println(netflix.name);
        System.out.println(netflix.company);
        System.out.println(netflix.showName);
        System.out.println(netflix.duration);
        System.out.println("Season: " + netflix.seasonNumber + ", Episode: " + netflix.episodeNumber);

        System.out.println();

        KevinHart kevin = new KevinHart("Chicago", "special name", "11/4/21");

        System.out.println(kevin.name);
        System.out.println(kevin.company);
        System.out.println(kevin.special);
        System.out.println(kevin.date);
        System.out.println(kevin.location);

    }
}
