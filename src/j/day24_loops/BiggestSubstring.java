package j.day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {

        String s = "aaabbbcccccddddeeeeee";
        String sub = ""; //
        String biggest = ""; // ccccc

        for(int i = 0; i < s.length() - 1; i++){

            sub += s.charAt(i);

            if(s.charAt(i) != s.charAt(i + 1)){  // when the character of i is different from the character next to it (i + 1)

                if(sub.length() > biggest.length()){
                    biggest = sub; // assigns the substring as the new biggest
                }
                sub = ""; // resets this String for the next substring
            }

        }

        System.out.println(biggest);




    }
}
/*
 Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
        String s = input.nextLine().toLowerCase().trim();
        String sub = "";
        String biggest = "";

        for (int i = 0; i < s.length() - 1; i++) {
            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)) {
                if (sub.length() > biggest.length()) {
                       biggest = sub;
                   }
                sub = "";
            }
        }
        if(s.charAt(s.length() - 1) == s.charAt(s.length() - 2)){
            if(sub.length() + 1 > biggest.length()){
                biggest = sub + s.charAt(s.length() - 1);
            }
        }

        System.out.println("\n---------RESULT---------");
        System.out.println(biggest);
 */