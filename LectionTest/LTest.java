package LectionTest;

import java.util.HashSet;
import java.util.Set;

public class LTest {
    public static void main(String[] args){
        Worker w1 = new Worker();
        w1.id = 1000;
        w1.firstName = "Андрей";
        w1.lastName = "Малышев";
        w1.salary = 45000;
        System.out.println(w1.firstName);
    }

}
