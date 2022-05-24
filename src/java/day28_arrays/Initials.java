package java.day28_arrays;

public class Initials {
    public static void main(String[] args) {

        String[] arr = {"James Bond", "Eve Rell", "Anna Johnson"};
        String res = "";

        for (int i = 0; i < arr.length; i++) {
            res = arr[i].toUpperCase();
            System.out.println("" + res.charAt(0) + res.charAt(res.indexOf(" ") + 1));
        }
    }
}
/*
initials
• Given an array of classmate’s names, first name and last separated by a
space, print the initials of everyone
 */