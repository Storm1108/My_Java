package Homework.Hw6;

import java.util.HashSet;
import java.util.TreeSet;

public class init {
    public static void main(String[] args) {
        String leftAlignFormat = "| %-8s | %-8s | %-8s | %-7d | %-3s | %-8s | %-10d |%n";
        System.out.format("+----------+----------+----------+---------+-----+----------+------------+%n");
        System.out.format("|    Имя   |    ОС    |   Цвет   | ОЗУ, Мб | SSD | Диск, Гб | Цена, руб. |%n");
        System.out.format("+----------+----------+----------+---------+-----+----------+------------+%n");
        TreeSet<Laptop> laptops = new TreeSet<>();
        for (int i = 0; i < 40; i++) {
            laptops.add(new Laptop(true));
        }
        for (Laptop pos : laptops){
            System.out.format(leftAlignFormat,pos.getName(),pos.getOs(),pos.getColour(),pos.getRam(),
                    pos.isSsd(),pos.getDisk(), pos.getPrice());
        }
        System.out.format("+----------+----------+----------+---------+-----+----------+------------+%n");
    }
}
