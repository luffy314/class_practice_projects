package practice_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice14 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 0, 0, 0, 3, 4, 5));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)==0&&list.get(j)!=0){
                    Collections.swap(list, i, j);
                }
            }
        }
        System.out.println(list);
    }

    }


