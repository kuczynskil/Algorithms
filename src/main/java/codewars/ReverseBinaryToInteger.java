package main.java.codewars;

public class ReverseBinaryToInteger {

//    Write a function that reverses the bits in an integer.
//
//For example, the number 417 is 110100001 in binary. Reversing the binary is 100001011 which is 267.
//
//You can assume that the number is not negative.


    public static int reverse_bits(int n){
        String binary = Integer.toBinaryString(n);
        return Integer.parseInt(new StringBuilder(binary).reverse().toString(), 2);
    }
}
