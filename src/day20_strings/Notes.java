package day20_strings;

public class Notes {
//    Day 20 String Practice
//
//    day20string
//            __
//
//    Recap
//
//    general syntax to use methods:     stringObject.method()
//
//    Index: a number position. Every character in a String has an index
//    indexes start from 0
//
//    String s = "apple";
//                    01234
//
//    charAt(int index): returns the character at the given index
//    ex:    s.charAt(0) --> 'a'
//            s.charAt(3) --> 'l'
//            s.charAt(6) --> StringIndexOutOfBoundsException
//
//                -> If you use any index that is not valid you will get the exception/error
//
//    indexOf(): returns the index (int) based on the given argument
//
//        (char): return the index where the given char is found in the String. It returns the first occurrence of that character
//
//    ex:
//            s.indexOf('a') --> 0
//            s.indexOf('p') --> 1
//            s.indexOf('z') --> -1
//
//            -> When a char is not found in the String, it returns -1
//
//            (String): returns the index of the character sequence in the String. It returns the index where the sequence starts
//
//    ex:
//            s.indexOf("ppl") --> 1
//            s.indexOf("le") --> 3
//            s.indexOf("pear") --> -1
//            s.indexOf("a") --> 0
//
//            (char, int): it returns the index of the given char, but it starts looking at the given int index number
//
//    ex:
//    String a = "applep"
//                                012345
//                                        a.indexOf('p', 2) --> 2
//                                        a.indexOf('p', 3) --> 5
//
//                                        (String, int)
//
//    lastIndexOf(): returns the index (int) based on the given argument, but it checks from the end of the String
//
//    ex:
//
//            s.lastIndexOf('p') --> 2
//
//    come back 8:20 est
}
