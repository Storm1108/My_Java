package Homework.Hw1;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

public class Hw14 {
    public static String encoding = System.getProperty("console.encoding", "utf-8");
    public static Scanner iScaner = new Scanner(System.in, encoding);

    static int quantityOfQuestions(char[] number) {
        int count = 0;
        for (char element : number)
            if (element == '?') {
                count++;
            }
        return count;
    }

    static char[] parse(String number) {
        return number.toCharArray();
    }

    static int change(char[] number, int input) {
        char[] numberRes = new char[number.length]; // создаем промежуточный массив
        System.arraycopy(number, 0, numberRes, 0, number.length);//копируем массив, так как при передаче в функцию массива вы передаете туда ссылку
        for (int i = 0; i < number.length; i++) {
            if (number[i] == '?') {
                char a = Character.forDigit(input, 10);
                numberRes[i] = a; //тут меняется переменная numbers и вместе с ней меняется переменная которую я передаю на ее место
                System.out.println("Проверяем "+ new String(numberRes)); //немного изменил вывод
            }
        }
        return Integer.parseInt(new String(numberRes));
    }
    static String input(Character n){
        System.out.printf("Введите число %c: ", n);
        return iScaner.nextLine();
    }
    static int combine(char[] q, char[] w, char[] e){
        int i = 0;
        int count = 0;
        System.out.println("Комбинация...");
        int[] fills = new int[Math.max(Math.max(quantityOfQuestions(q), quantityOfQuestions(w)), quantityOfQuestions(e))];
        System.out.println("Длина искомого массива: " + fills.length);
        System.out.println();
        while (i<10) {
            int a = change(q, i); //вот 3 вызова, которые меняют в итоге и переменные q, w, e тоже
            int b = change(w, i);
            int c = change(e, i);
            System.out.println();
            if ((a + b) == c){
                System.out.printf("Вариант найден: %d + %d = %d\n", a, b, c);
                count++;
            }
            i++;
            System.out.println("i " + i);
            Arrays.fill(fills, i);
        }
        return count;
    }
    public static void main(String[] args){
        String q = input('q');
        String w = input('w');
        String e = input('e');
        System.out.printf("%s + %s = %s\n", q, w, e);
        char[] qArr = parse(q);
        char[] wArr = parse(w);
        char[] eArr = parse(e);
        int count = combine(qArr,wArr,eArr);
        if (count == 0) System.out.println("Нет таких чисел");
        else System.out.println("Возможно вариантов: "+ count);
    }
}