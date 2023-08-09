package Homework.Hw3;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw32 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array.add((int) (Math.random() * 10));
        }
        System.out.println(array);
        Iterator<Integer> iter = array.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0)                   //array.removeIf(integer -> integer % 2 == 0);
                iter.remove();
        }
        System.out.println(array);
    }
}

