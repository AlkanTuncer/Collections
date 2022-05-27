package day061.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_Map3 {
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

        Set<Map.Entry<String, Integer>> entries = aylar.entrySet();
        long count = entries.stream().filter(item -> item.getValue() == 30).count();

        System.out.println("30 gün olan ay adedi : "+count);

    }
}
