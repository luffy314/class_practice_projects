package java.day24_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is a java language.java";
        int count = 0;

        for(int i = 0; i < str.length() - 3; i++){ // i <= str.length() - 4;

            String everyFour = str.substring(i, i + 4);
//            System.out.println(everyFour);
            if(everyFour.equals("java")){
                count++;
            }

        }

        System.out.println(count);


    }
}
/*
String str = "java is a java language.java";
        int count = 0;

        while(str.contains("java")){
            str =  str.replaceFirst("java", "*");
            count++;
            System.out.println(str);
        }

        System.out.println(count);
        System.out.println(str);
 */