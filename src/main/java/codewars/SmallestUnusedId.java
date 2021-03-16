package main.java.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestUnusedId {

//    Hey awesome programmer!
//
//You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!
//
//Therefore you need a method, which returns the smallest unused ID for your next new data item...
//
//Note: The given array of used IDs may be unsorted. For test reasons there may
// be duplicate IDs, but you don't have to find or remove them!
//
//Go on and code some pure awesomeness!

    public static int nextId(int[] ids) {
        if (ids.length == 0) return 0;
        Arrays.sort(ids);
        if (ids[0] != 0) return 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i + 1] != ids[i] + 1 && ids[i + 1] != ids[i]) return ids[i] + 1;
        }
        return ids[ids.length - 1] + 1;
    }

    public static void main(String[] args) {
        System.out.println(nextId(new int[]{1, 2, 0, 2, 3}));

    }
}
