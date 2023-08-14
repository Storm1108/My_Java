package Homework.Hw5;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Hw51 {
    public static void main(String[] args) throws IOException {
        HashMap<Long, String> book = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("Homework/Hw5/input.txt"));
        String read = reader.readLine();
        while (read != null){
            String[] readArr = read.split(" ");
            book.put(Long.parseLong(readArr[0]), readArr[1]);
            read = reader.readLine();
        }
        System.out.println(book);
    }
}
