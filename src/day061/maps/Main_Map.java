package day061.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_Map {
    public static void main(String[] args) {

        // Map <Key , Value>  --> Key aynı olamaz, UNIQUE olmak zorunda

        Map<Integer,String> aylar = new HashMap<>();
        aylar.put(1,"Ocak");
        aylar.put(2,"Şubat");
        aylar.put(3,"Mart");
        aylar.put(4,"Nisan");
        aylar.put(5,"Mayıs");
        aylar.put(6,"Haziran");
        aylar.put(7,"Temmuz");
        aylar.put(8,"Ağustos");
        aylar.put(9,"Eylül");
        aylar.put(10,"Ekim");
        aylar.put(11,"Kasım");
        aylar.put(12,"Aralık");

        System.out.println(aylar);
        System.out.println();

        Map<Integer,String> bolumler = new TreeMap<>();
        bolumler.put(1,"Muhasebe");
        bolumler.put(2,"Pazarlama");
        bolumler.put(3,"Bilgi İşlem");

        System.out.println(bolumler);
        System.out.println();

        Map<String ,String> personel = new TreeMap<>();
        personel.put("Ahmet","Pazarlama");
        personel.put("Osman","Pazarlama");

        System.out.println(personel);


    }
}
