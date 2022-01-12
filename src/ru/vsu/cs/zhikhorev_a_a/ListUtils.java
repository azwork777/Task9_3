package ru.vsu.cs.zhikhorev_a_a;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    // взял класс у Семёнова Дмитрия
    public static List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            list.add(i, array[i]);
        }
        return list;
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
