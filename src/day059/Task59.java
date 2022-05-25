package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task59 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9,10);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));
            }else {
                oddNumbers.add(numbers.get(i));
            }
        }

        for (var item : numbers){
            System.out.println(item);
        }

        Iterator<Integer> iterator = oddNumbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.print(evenNumbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2==1){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);

        // Gürhan Hocanın Çözümü

        List<Integer> numbers1 = new ArrayList<>();
        Collections.addAll(numbers1,1,2,3,4,5,6,7,8,9,10);

        List<Integer> oddNumbers1 = new ArrayList<>();
        List<Integer> evenNumbers1 = new ArrayList<>();

        for (var item : numbers1){
            boolean b = item % 2 == 0 ? evenNumbers1.add(item) : oddNumbers1.add(item);
        }

        for (var item : numbers1){
            System.out.print(item+" ");
        }
        System.out.println();

        Iterator<Integer> iterator1 = oddNumbers1.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();

        System.out.println(evenNumbers1);


    }
}
