package java.day30_arrays;

import java.util.Arrays;

public class URL {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";
        String[] parts = url.split("/");
        System.out.println(parts);
        System.out.println(Arrays.toString(parts));

        for(int i=0; i<parts.length;i++){
            System.out.println(parts[i]);
        }



    }
}
/*
URL Parts

Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130
____________________________________________________________

AWS Zones

Given an app name and a String of zones in the following format

	us-east-1,us-west-1,us-west-2,us-west-3

	print the app deploying to each zone

Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1

    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
____________________________________________________________

Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
____________________________________________________________

Reverse Each word

Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split

Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC

____________________________________________________________



 */