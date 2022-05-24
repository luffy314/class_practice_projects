package java.day30_arrays;

public class DoubleTemp {
    public static void main(String[] args) {
        double[] temps = {80,88,88,84,82,78,60,68};
        double average=0;
        for(int i=0;i<temps.length;i++){
           average+=temps[i];

        }
        System.out.println(average/temps.length);
    }
}
