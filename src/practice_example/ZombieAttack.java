package practice_example;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("how many cities");
        int numCities= input.nextInt();
        int[] inhabitants = new int[numCities];
        int[] inhabitants2=new int[numCities];

        for(int i=0;i<numCities;i++){
            System.out.println("city number "+(i+1));
            inhabitants[i]= input.nextInt();
        }

        int days=0;
        while(!Arrays.equals(inhabitants,inhabitants2)){
            System.out.println(Arrays.toString(inhabitants));
            days++;
        for(int i=1;i<numCities;i++){
            if(inhabitants[0] !=0 && inhabitants[1]==0){
                inhabitants[0]= (int) (inhabitants[0]*.5);
            }
            if(inhabitants[numCities-1] !=0 && inhabitants[numCities-2]==0) {
                inhabitants[numCities-1] = (int) (inhabitants[numCities-1] * .5);
            }
            if(i !=numCities-1 && (inhabitants[i-1]==0 || inhabitants[i+1]==0)){
                inhabitants[i]= (int) (inhabitants[i]*.5);
            }
        }}
        System.out.println(Arrays.toString(inhabitants));
        System.out.println(days);

    }
}
