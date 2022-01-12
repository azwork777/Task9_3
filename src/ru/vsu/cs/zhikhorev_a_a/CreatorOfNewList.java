package ru.vsu.cs.zhikhorev_a_a;

import java.util.ArrayList;
import java.util.List;

public class CreatorOfNewList {

    public static List<Integer> createNewList(List<Integer> list1, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        if (list1.size() <= list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).equals(list2.get(i))) {
                    listResult.add(list1.get(i));
                }
            }
        }

        if (list1.size() > list2.size()) {
            for (int i = 0; i < list2.size(); i++) {
                if (list1.get(i).equals(list2.get(i))) {
                    listResult.add(list1.get(i));
                }

            }

        }
        return listResult;

    }
}


