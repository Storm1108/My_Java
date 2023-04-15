package Homework.Hw1;

import java.util.Scanner;

public class Hw12 {
    static boolean isPrime(int n){
        if (n == 1) return false;
        for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++){
            if ((n % i) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
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
                int[] array = new int[n];       // В условии сказано сделать массив, так что добавил его,
                                                // но вывод в консоль сделал напрямую, а не из массива, чтобы не крутить еще один цикл
                int j = 0;
                for (int i = 1; i <= n; i++){
                    if (isPrime(i)) {
                        array[j] = i;
                        System.out.print(i + " ");
                        j++;
                    }
                }
                break;

            } catch (Exception ex) {
                System.out.print("Введите натуральное положительное число n: ");

            }
        }
    }
}
