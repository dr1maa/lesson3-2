//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(0);
        arr.add(5);
        arr.add(-2);
        arr.add(20);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        int min = arr.get(0);
        int max = arr.get(0);
        for (Integer i : arr) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
}