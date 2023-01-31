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
        Iterator<Integer> arrayIterator = arr.iterator();
        while (arrayIterator.hasNext()) {
            Integer nextArr = arrayIterator.next();
            if (nextArr % 2 == 0){
                arrayIterator.remove();
            }
        }
        System.out.println(arr);
    }
}