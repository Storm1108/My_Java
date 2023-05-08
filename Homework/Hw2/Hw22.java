package Homework.Hw2;
import java.io.IOException;
import java.util.logging.*;

public class Hw22 {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger(Hw22.class.getName());
            FileHandler fh = new FileHandler("Homework/Hw2/logger.log");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.setUseParentHandlers(false);
            logger.log(Level.INFO, "Начало логирования");
        long[] array = new long[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random()*10);
            System.out.print(array[i] + " ");
            logger.log(Level.INFO, "Сгенерировано: " + array[i]);
        }
        System.out.println();
        long temp = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length-1; k++) {
                if (array[k] > array[k+1]) {
                    temp=array[k+1];
                    array[k+1] = array[k];
                    array[k] = temp;
                    logger.log(Level.INFO, "Поменяли " + array[k+1] + " и " + array[k]);
                }
            }
        }
        for (long elem:
             array) {
            System.out.print(elem + " ");
        }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

