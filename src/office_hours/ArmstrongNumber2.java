package office_hours;

public class ArmstrongNumber2 {
    public static void armStrong(int num) {
        //first attempt
        String str = "" + num;
        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < 3; i++) {
            sum += (arr[i] - 48) * (arr[i] - 48) * (arr[i] - 48);
        }
        System.out.println(sum == num ? "armstrong" : "not armstrong");

        //second attempt
        String str2 = "" + num;
        int sum2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            sum2 += (str2.charAt(i) - 48) * (str2.charAt(i) - 48) * (str2.charAt(i) - 48);
        }
        System.out.println(sum2 == num ? "armstrong" : "not armstrong");
    }

    public static void main(String[] args) {
        armStrong(153);
    }
}
