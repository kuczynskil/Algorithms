package main.java.codewars;

public class FakeBinary {

//    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5
//    and above with '1'. Return the resulting string.

    public static String fakeBin(String numberString) {
        numberString = numberString.replaceAll("[0-4]", "0");
        numberString = numberString.replaceAll("[5-9]", "1");
        return numberString;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("543"));
    }
}
