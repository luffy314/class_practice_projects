package java.day37_homework;

public class HTMLGenerator {
    public static void main(String[] args) {

        String tag="gia^10";
        String word="";
        String num="";
        int size;

        for(int i=0;i<tag.length();i++){
            if(tag.charAt(i)=='^' && Character.isDigit(tag.charAt(i+1))){
                num=tag.substring(i+1);
                word=tag.substring(0,i);
            }
        }
        size=Integer.parseInt(num);
        System.out.println(word);
        System.out.println(size);

        for(int i=0;i<size;i++){
            System.out.print("<"+word+"></"+word+">");
        }


    }
}

/*
HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>


 */

// /sorry i don't know what u mean by "i could not make it?", but i just copied ur code into intellij to double check, and i put in a 7 letter password and it accepted it when it shouldn't