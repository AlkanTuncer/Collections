package day061.sets;

import java.text.Collator;
import java.util.*;

public class Main_Set {
    public static void main(String[] args) {

        Set<String> kume = new HashSet<>();      // Set'de get() metodu yok cunku indeks garantisi yok.
        kume.add("Hatice");
        kume.add("Cengiz");
        kume.add("Sabit");
        kume.add("Hasan");
        kume.add("Ali Cengiz");
        kume.add("Çağrı");
        kume.add("Ömer");

        System.out.println("HashSet : "+kume);  // HastSet harflerin hash değerlerine göre sıralama yapıyor.

        Set<String> isimler = new TreeSet<>(kume);

        System.out.println("TreeSet : "+isimler);  // TreeSet alfabeye göre sıralar. Ama Türkçe karakterler sona atılır otomatik sort edildiği için.


        Iterator<String> iterator = kume.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (var item : kume){
            System.out.println(item);
        }

        Set<String> isimler2 = new TreeSet<>(                                 // TreeSet üyelerini alfabeye göre sıralar.
                Collator.getInstance(new Locale("tr","TR"))   // Türkçe karakterler için dil kodu ekledik.
        );

        isimler2.addAll(kume);          // kume Collection'ı ekledik.
        System.out.println(isimler2);   // Alfabeye göre yazdırdık.

    }
}
