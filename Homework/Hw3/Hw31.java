package Homework.Hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Hw31 {
    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next();
        }
        return ret;
    }
    public static int[] sort (int[] A){
        if (A.length == 1 || A.length == 0) return A;
        int[] L = sort(Arrays.copyOfRange(A, 0, A.length / 2));
        int[] R = sort(Arrays.copyOfRange(A, A.length / 2, A.length));
        int n = 0;
        int m = 0;
        List<Integer> C = new ArrayList<>();
        while (n < L.length && m < R.length){
            if (L[n] <= R[m]){
                C.add(L[n]);
                n++;
            }
            else {
                C.add(R[m]);
                m++;
            }
        }
        while (n < L.length){
            C.add(L[n]);
            n++;
        }
        while (m < R.length){
            C.add(R[m]);
            m++;
        }
        return convertIntegers(C);
    }
    public static void main(String[] args){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }
}
