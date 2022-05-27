package day061.maps;

import java.util.*;

public class Main_Map2 {
    public static void main(String[] args) {

        Map<String ,Integer> aylar = new HashMap<>();
        aylar.put("Ocak",31);
        aylar.put("Şubat",28);
        aylar.put("Mart",31);
        aylar.put("Nisan",30);
        aylar.put("Mayıs",31);
        aylar.put("Haziran",30);
        aylar.put("Temmuz",31);
        aylar.put("Ağustos",31);
        aylar.put("Eylül",30);
        aylar.put("Ekim",31);
        aylar.put("Kasım",30);
        aylar.put("Aralık",31);

        System.out.println(aylar);  // Hash değerine göre sıralar.

        Set<String> ayIsimleri = aylar.keySet();
        ayIsimleri.stream().forEach(System.out::println);

        Collection<Integer> ayGunleri = aylar.values();
        ayGunleri.stream().forEach(System.out::println);

        Set<Map.Entry<String,Integer>> entries = aylar.entrySet();
        entries.forEach(System.out::println);

    }
}
