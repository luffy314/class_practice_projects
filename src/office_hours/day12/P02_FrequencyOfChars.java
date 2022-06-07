package office_hours.day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class P02_FrequencyOfChars {
    public static void main(String[] args) {


        /*
             find frequencies of the characters in a String

                input:
                    aaabbc

                output:
                    a3b2c1
         */

        String str="dddaaabbcfffgg";
        String result="";    // a3b2c1

        List<String> strings = Arrays.asList(str.split(""));


        for (String each : new LinkedHashSet<>(strings)) {

            int freq= Collections.frequency(strings,each);
            // if(!result.contains(each))
            result+=each+freq;
        }
        System.out.println(result);

    }
}
