package main.java.codewars;

public class AlphabetPosition {

//    When provided with a letter, return its position in the alphabet.
//
//Input :: "a"
//
//Ouput :: "Position of alphabet: 1"

    public static String position(char alphabet) {
        return "Position of alphabet: " + (alphabet - '0' - 48);
    }

    public static void main(String[] args) {
        System.out.println('a' - '0');
    }
}
