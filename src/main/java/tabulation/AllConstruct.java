package main.java.tabulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllConstruct {

    public static List<String[]> allConstruct(String targetWord, String[] wordBank) {
        List<List<String[]>> table = new ArrayList<>(Collections.nCopies(targetWord.length() + 1, null));
        table.set(0, new ArrayList<>());
        table.get(0).add(new String[0]);

        for (int i = 0; i < targetWord.length(); i++) {
            if (null != table.get(i)) {
                for (String s : wordBank) {
                    int index = i + s.length();
                    if (index < table.size() && targetWord.startsWith(s, i)) {
                        if (null == table.get(index)) table.set(index, new ArrayList<>());
                        for (String[] strings : table.get(i)) {
                            table.get(index).add(addElementToArray(strings, s));
                        }
                    }
                }
            }
        }
        return table.get(table.size() - 1);
    }

    public static String[] addElementToArray(String[] inputTable, String element) {
        String[] newArray = Arrays.copyOf(inputTable, inputTable.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static void main(String[] args) {
        List<String[]> result = allConstruct("abc", new String[] {"a", "b", "c", "abc", "ab", "bc"});
        for (String[] strings : result) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
