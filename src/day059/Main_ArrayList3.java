package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main_ArrayList3 {
    public static void main(String[] args) {

        // get()
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,5,6,7,8,9,10);

        Integer integer = numbers.get(5);
        System.out.println("5.index = "+integer);

        // Iterator ile erişim
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        // Equality
        System.out.println(numbers.get(4)==numbers.get(5));
        System.out.println(numbers.get(4)==numbers.get(6));

        // CHANGE
        List<String> animals = new ArrayList<>();
        animals.add("Aslan");
        animals.add("Kaplan");
        animals.add("Fil");

        System.out.println(animals);
        animals.set(1,"Yavru Aslan"); // "Kaplan" nesnesi "Yavru Aslan" ile değiştirildi.
        System.out.println(animals);

        int filIndex = animals.indexOf("Fil");
        animals.set(filIndex,"Zürafa");
        System.out.println(animals);

        int index = animals.indexOf("Köpek");
        if (index != -1){
            animals.set(index,"Gergedan");
        }
        System.out.println(animals);

        int indeks = -1;
        Iterator<String> iterator1 = animals.iterator();
        while (iterator1.hasNext()){
            String item = iterator1.next();
            if (item.equalsIgnoreCase("aslaN")){
                indeks = animals.indexOf(item);
                break;
            }
        }
        System.out.println(indeks);

    }
}
