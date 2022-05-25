package day059;

import java.util.ArrayList;
import java.util.Iterator;

public class Task59 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

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


    }
}
