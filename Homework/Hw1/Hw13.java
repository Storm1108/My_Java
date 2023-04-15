package Homework.Hw1;
import java.util.Objects;
import java.util.Scanner;
public class Hw13 {
    static void calculate(String choice){
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScaner = new Scanner(System.in, encoding);
        try {
            int test = Integer.parseInt(choice);
            System.out.print("Введите первое число: ");
            double a = iScaner.nextDouble();
            System.out.print("Введите второе число: ");
            double b = iScaner.nextDouble();
            double res = 0;
            switch (choice) {
                case "1" -> {
                    res = a + b;
                    System.out.printf("%.1f + %.1f = %.1f\n", a, b, res);
                }
                case "2" -> {
                    res = a - b;
                    System.out.printf("%.1f - %.1f = %.1f\n", a, b, res);
                }
                case "3" -> {
                    res = a * b;
                    System.out.printf("%.1f * %.1f = %.1f\n", a, b, res);
                }
                case "4" -> {
                    res = a / b;
                    System.out.printf("%.1f / %.1f = %.2f\n", a, b, res);
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Введите корректное число");
        }

    }
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScaner = new Scanner(System.in, encoding);
        while (true){
            System.out.println("""
                    Выберите операцию:\s
                    1 - Сложение
                    2 - Вычитание
                    3 - Умножение
                    4 - Деление
                    0 - Выйти из калькулятора""");
            String choice = iScaner.nextLine();
            if (Objects.equals(choice, "0")) {
                System.out.println("Выход...");
                break;
            }
            calculate(choice);
            }
        }
    }

