package j.day19_Strings;

public class MergeStrings {
    public static void main(String[] args) {

        String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0); // merged = merged + a.charAt(0)
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);
        System.out.println(merged);



    }
}
