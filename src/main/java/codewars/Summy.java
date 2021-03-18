package main.java.codewars;

import java.util.Arrays;

public class Summy {

//    Write a function that takes a string which has integers inside it separated by spaces,
//    and your task is to convert each integer in the string into an integer and return their sum.
//
//Example
//summy("1 2 3")  ==> 6

    static long summy(String stringOfInts) {
        String[] ints = stringOfInts.split(" ");
        return Arrays.stream(ints).mapToLong(Long::parseLong).sum();
    }
}
