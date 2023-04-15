package Homework.Hw1;
import java.util.Scanner;

public class Hw11 {
    static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);
    }

    static double triangle(int n) {
        if (n == 1) return 1;
        return n + triangle(n - 1);
    }

    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScaner = new Scanner(System.in, encoding);
        System.out.print("Введите натуральное положительное число n: ");
        while (true) {
            try {
                int n = Integer.parseInt(iScaner.nextLine());
                System.out.println();
                while (n <= 0) {
                    System.out.print("Введите натуральное положительное число n: ");
                    n = Integer.parseInt(iScaner.nextLine());
                }
                System.out.println("Факториал: " + factor(n));
                System.out.println("Треугольное число: " + triangle(n));
                break;

            } catch (Exception ex) {
                System.out.print("Введите натуральное положительное число n: ");

            }
        }
    }
}
