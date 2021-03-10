package main.java.codewars;

public class Largest5DigitNumInSeries {

//    In the following 6 digit number:
//
//283910
//91 is the greatest sequence of 2 consecutive digits.
//
//In the following 10 digit number:
//
//1234567890
//67890 is the greatest sequence of 5 consecutive digits.
//
//Complete the solution so that it returns the greatest sequence of five consecutive digits found within the
// number given. The number will be passed in as a string of only digits. It should return a five digit integer.
// The number passed may be as large as 1000 digits.

    public static int solve(final String digits) {
        int result = 0;
        for (int i = 0; i <= digits.length() - 5; i++) {
            int candidate = Integer.parseInt(digits.substring(i, i + 5));
            if (candidate > result) result = candidate;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("1234567890"));
    }
}
