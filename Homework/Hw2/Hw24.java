package Homework.Hw2;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Hw24 {
    static void calculate(String choice, Logger logger){
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScaner = new Scanner(System.in, encoding);
        try {

            int test = Integer.parseInt(choice);
            System.out.print("Введите первое число: ");
            double a = iScaner.nextDouble();
            logger.log(Level.INFO, "Первое число " + a);
            System.out.print("Введите второе число: ");
            double b = iScaner.nextDouble();
            logger.log(Level.INFO, "Второе число " + b);

            double res = 0;
            switch (choice) {
                case "1" -> {
                    logger.log(Level.INFO, "Операция сложения");
                    res = a + b;
                    System.out.printf("%.1f + %.1f = %.1f\n", a, b, res);
                }
                case "2" -> {
                    logger.log(Level.INFO, "Операция вычитания");
                    res = a - b;
                    System.out.printf("%.1f - %.1f = %.1f\n", a, b, res);
                }
                case "3" -> {
                    logger.log(Level.INFO, "Операция умножания");
                    res = a * b;
                    System.out.printf("%.1f * %.1f = %.1f\n", a, b, res);
                }
                case "4" -> {
                    logger.log(Level.INFO, "Операция деления");
                    res = a / b;
                    System.out.printf("%.1f / %.1f = %.2f\n", a, b, res);
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Введите корректное число");
        }

    }
    public static void main(String[] args) throws IOException {
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScaner = new Scanner(System.in, encoding);
        Logger logger = Logger.getLogger(Hw24.class.getName());
        FileHandler fh = new FileHandler("Homework/Hw2/logger4.log");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setUseParentHandlers(false);
        logger.log(Level.INFO, "Начало логирования");
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
            calculate(choice, logger);
            }
        }
    }

