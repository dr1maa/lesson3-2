//Пусть дан произвольный список целых чисел, удалить из него четные числа

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
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        return sum / arr.size();
    }
}