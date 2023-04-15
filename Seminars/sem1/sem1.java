package Seminars.sem1;
import java.time.LocalDateTime;
import java.util.Scanner;
public class sem1 {
    public static void main(String[] args) {
        // String - "", char - '' - отличия типов
        // shift + alt + a - комментарий
        // System.out.println("Hello world!");
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        String encoding = System.getProperty("console.encoding", "utf-8");
        Scanner iScanner = new Scanner(System.in, encoding);
        System.out.print("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println(name);
        iScanner.close();
    }
    public static void task2(String[] args){

    }
}
