package Homework.Hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Hw41 {

    public static LinkedList<Integer> rev (LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
    public static LinkedList<Integer> enqueue (LinkedList<Integer> list, Integer a) {
        list.addLast(a);
        return list;
    }
    public static int dequeue (LinkedList<Integer> list) {
        int a = list.getFirst();
        list.removeFirst();
        return a;
    }

    public static int first (LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20 - 10));
        }
        System.out.println(list);
        System.out.println(rev(list));

    }
}
