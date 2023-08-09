package Homework.Hw3;

import java.util.ArrayList;

public class Hw33 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * 20 - 10));
        }
        System.out.println(array);
        Integer min = array.get(0);
        Integer max = array.get(0);
        float count = 0;
        for (Integer elem :
                array) {
            if (elem < min) min = elem;
            if (elem > max) max = elem;
            count += elem;
        }
        System.out.printf("""
                Минимальное значение: %d
                Максимальное значение: %d
                Среднее арифметическое: %,.2f""", min, max, count/array.size());
    }
}
