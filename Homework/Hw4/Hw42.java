package Homework.Hw4;

import java.util.LinkedList;

public class Hw42 {
    public static void enqueue (LinkedList<Integer> list, Integer a) {
        list.addLast(a);
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
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(queue, (int) (Math.random() * 20 - 10));
        }
        System.out.println(queue);
        System.out.println(first(queue));
        System.out.println(dequeue(queue));
        enqueue(queue, 20);
        System.out.println(first(queue));
        System.out.println(dequeue(queue));
        System.out.println(queue);

    }
}
