package main.java.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IrreducibleSumOfRationals {
    //    You will have a list of rationals in the form
//
//    lst = [ [numer_1, denom_1] , ... , [numer_n, denom_n] ]
//    or
//
//    lst = [ (numer_1, denom_1) , ... , (numer_n, denom_n) ]
//    where all numbers are positive integers. You have to produce their sum N / D in an irreducible
//    form: this means that N and D have only 1 as a common divisor.
//
//    Return the result in the form:
//
//            [N, D] in Ruby, Crystal, Python, Clojure, JS, CS, PHP, Julia, Pascal
//    Just "N D" in Haskell, PureScript
//"[N, D]" in Java, CSharp, TS, Scala, PowerShell, Kotlin
//"N/D" in Go, Nim
//    {N, D} in C++, Elixir
//    {N, D} in C
//    Some((N, D)) in Rust
//    Some "N D" in F#, Ocaml
//    c(N, D) in R
//(N, D) in Swift
//'(N D) in Racket
//    If the result is an integer (D evenly divides N) return:
//
//    an integer in Ruby, Crystal, Elixir, Clojure, Python, JS, CS, PHP, R, Julia
//    Just "n" (Haskell, PureScript)
//            "n" Java, CSharp, TS, Scala, PowerShell, Go, Nim, Kotlin
//    {n, 1} in C++
//    {n, 1} in C
//    Some((n, 1)) in Rust
//    Some "n" in F#, Ocaml,
//            (n, 1) in Swift
//    n in Racket
//            (n, 1) in Pascal
//    If the input list is empty, return
//
//    nil/None/null/Nothing
//    {0, 1} in C++
//    {0, 1} in C
//"0" in Scala, PowerShell, Go, Nim
//    O in Racket
//"" in Kotlin
//[0, 1] in C++
//    Example:
//            [ [1, 2], [1, 3], [1, 4] ]  -->  [13, 12]
//
//            1/2  +  1/3  +  1/4     =      13/12


    public static String sumFracts(int[][] l) {
        if (l.length == 0) return null;
        long commonDenominator = 1;
        for (int[] ints : l) {
            commonDenominator *= ints[1];
        }

        long nominatorSum = 0;
        for (int[] ints : l) {
            nominatorSum += (ints[0] * (commonDenominator / ints[1]));
        }
        while (true) {
            long gcd = gcdByEuclidsAlgorithm(nominatorSum, commonDenominator);
            if (gcd == 1) {
                break;
            }
            nominatorSum /= gcd;
            commonDenominator /= gcd;
        }
        if (commonDenominator == 1) return String.valueOf(nominatorSum);
        return "[" + nominatorSum + ", " + commonDenominator + "]";
    }

    static long gcdByEuclidsAlgorithm(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }


    public static void main(String[] args) {
        System.out.println(sumFracts(new int[][]{{1, 2}, {1, 3}, {1, 4}}));
    }
}
