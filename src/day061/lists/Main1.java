package day061.lists;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {

        List<String> ulkeler = Arrays.asList("Türkiye","Çin","Amerika","İngiltere");

        System.out.println("Eklendiği sıraya göre : "+ulkeler);

        ulkeler.sort(Collator.getInstance(new Locale("tr","TR")));
        System.out.println("Karaktere göre sıralı : "+ulkeler);

    }
}
