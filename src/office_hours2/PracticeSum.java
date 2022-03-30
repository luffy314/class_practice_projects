package office_hours2;

public class PracticeSum {
    public static void main(String[] args) {

        System.out.println(sumOfAllIntegers("jav45ai1000sgre1at82"));
    }

    public static int sumOfAllIntegers(String str) {

        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = str.replace(str.charAt(i) + "", " ");
            }
        }

        String[] arr = str.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                res += Integer.parseInt(arr[i]);
            }
        }

        return res;
    }

}