package day057;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        var x = 5;
        var str = "Dante";

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){   // Tercih edilen döngü şekli budur. iteratör'lü.
            String next = iterator.next();
            System.out.println(next);
        }

        for (var item : list){
            System.out.println(item);
        }

    }
}
