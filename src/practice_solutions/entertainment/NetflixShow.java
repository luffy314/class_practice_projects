package practice_solutions.entertainment;

/*
create a class Netflix
-> Netflix is a child of Streaming

instance variables:
- show name (String)
- episode number (int)
- season number (int)

constructor:
- initialize name, company, duration, show name, episode number, and
season number
-> call super constructor
 */

public final class NetflixShow extends Streaming{

    String showName;
    int episodeNumber;
    int seasonNumber;

    public NetflixShow(double duration, String showName, int episodeNumber, int seasonNumber){
        super("Netflix", duration); // sets Netflix as the company value
        this.showName = showName;
        this.episodeNumber = episodeNumber;
        this.seasonNumber = seasonNumber;
    }

}


