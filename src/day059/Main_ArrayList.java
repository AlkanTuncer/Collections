package day059;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main_ArrayList {
    public static void main(String[] args) {

        Iterable<String> list1 = new ArrayList<>();   // Iterable ve Collection bir interface. O yüzden nesnesi olusmaz. new Arraylist diyoruz.
        Collection<String> list2 = new ArrayList<>(); // Collection'dan declare edersek kısmen metotları kullanabiliriz.
        list2.add("A");
        list2.add("B");

        for (var item : list2){
            System.out.print(item+" ");
        }
        System.out.println();

        List<String> list3 = new ArrayList<>();  // Iterable(Parent)-Collection(Child)-List(GranChild) interfacleri implement sırasından dolayı en cok metot list3'de vardır.

        Iterable<String> list4 = List.of("A","B","C","D","E");
        Collection<String> list5 = List.of("A","B","C","D","E");
        List<String> list6 = List.of("A","B","C","D","E");

        list3.addAll(list5);
        list3.add(1,"T");  // ("A","T","B","C","D","E")


        ArrayList<String> list7 = new ArrayList<>(list3);

        for (var item : list7){
            System.out.print(item+" ");
        }



    }
}
