package j.day29_arrays;

import java.util.Arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        String[] web={"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", " mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", " spotify.com", };

        int com=0;
        int org=0;
        int edu=0;
        int other=0;

        for(int i=0; i< web.length; i++){
            if(web[i].contains(".com")){
                com++;
            }else if(web[i].contains(".org")) {
                org++;
            }else if(web[i].contains(".edu")) {
                edu++;
            }else {
                other++;
            }
        }
        System.out.println(Arrays.toString(web));
        System.out.println(".com "+ com+"\n.org "+org+"\n.edu "+ edu+"\nother "+ other);
    }
}

/*
Website checker
Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu
 */