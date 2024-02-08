package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
        Collections.reverse(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int calculatedA = calc(intA);
        int calculatedB = calc(intB);
        return calculatedA > calculatedB ? -1 : (calculatedA < calculatedB) ? 1 : 0;
    }

    private int calc(int x) {
        double form = Math.pow(5*x, 2) + 3;
        int result = (int) form;
        return result;
    }
}
