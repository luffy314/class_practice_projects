package my_utilities;

public class StringUtil {
      /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i)+"";
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
}
