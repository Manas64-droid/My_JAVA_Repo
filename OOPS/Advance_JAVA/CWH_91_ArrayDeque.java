package Advance_JAVA;

import java.util.ArrayDeque;

public class CWH_91_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        ArrayDeque<Integer> adq1=new ArrayDeque<>(5);
        adq1.add(64);
        adq.addFirst(89);
        adq.addLast(88);
        System.out.println(adq.getFirst());
        System.out.println(adq.getLast());
    }
}
