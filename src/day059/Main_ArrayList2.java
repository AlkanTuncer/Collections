package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Boolean> logic = new ArrayList<>();
        ArrayList<Integer> sayilar = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9,10);

        numbers.add(11);  // Sonuna 11 ekledik.
        numbers.add(1,53); // 1. indexi yani 2 olan elemanı 53 yaptık.

        System.out.println(numbers);

        List<Integer> tekSayilar = new ArrayList<>();
        tekSayilar.add(1);
        tekSayilar.add(3);

        numbers.addAll(tekSayilar);
        System.out.println(numbers);

    }
}
