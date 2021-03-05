package main.java.codewars;

public class OverTheRoad {
//    Task
//You've just moved into a perfectly straight street with exactly n
// identical houses on either side of the road. Naturally, you would like to
// find out the house number of the people on the other side of the street. The street looks something like this:
//
//Street
//1|   |6
//3|   |4
//5|   |2
//Evens increase on the right; odds decrease on the left. House numbers start at 1 and increase without gaps.
// When n = 3, 1 is opposite 6, 3 opposite 4, and 5 opposite 2.
//
//Example
//Given your house number address and length of street n, give the house number on the opposite side of the street.
//
//CodeWars.overTheRoad(long address, long n)
//CodeWars.overTheRoad(1, 3) = 6
//CodeWars.overTheRoad(3, 3) = 4
//CodeWars.overTheRoad(2, 3) = 5
//CodeWars.overTheRoad(3, 5) = 8

    public static long overTheRoad(long address, long n) {
        long row = (address % 2 == 0) ? Math.abs((address - n * 2) / 2) + 1 : address / 2 + 1;
        return (address % 2 == 0) ? (row - 1) * 2 + 1 : (n + 1 - row) * 2;
    }

    public static void main(String[] args) {
        System.out.println(overTheRoad(1, 4));
    }
}
