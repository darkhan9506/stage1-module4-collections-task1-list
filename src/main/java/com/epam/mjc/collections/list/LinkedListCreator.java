package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> resList = new LinkedList<>();
        for (int i : sourceList) {
            if (i % 2 == 1) {
                resList.addFirst(i);
            }
        }
        for (int i : sourceList) {
            if (i % 2 == 0) {
                resList.add(i);
            }
        }
        return resList;
    }
}
