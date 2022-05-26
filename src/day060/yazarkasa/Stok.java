package day060.yazarkasa;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class Stok extends ArrayList<Urun> {

    private static final Collator DIL_TR = Collator.getInstance(new Locale("tr","TR"));  // Türkçe karakterler isim sıralamada sona gitmesin diye.

    public void listele(){
        System.out.println("Ürün Listesi");
        this.stream().forEach(System.out::println);   // Declarative kodlama.
        System.out.println();

        // for (int i = 0; i < size(); i++) {     Imperative kodlama.
        //     System.out.println(get(i));
        // }
    }

    public void isimSiraliListele(){
        System.out.println("İsme Göre Sıralı Ürün Listesi");
        stream().sorted(Comparator.comparing(Urun::adi,DIL_TR)).forEach(System.out::println);  // declarative kodlama. Stream döndüren ara metotlara 'intermediate operators' denir.
        System.out.println();                                                                  //  long, List, Type döndüren metotlara 'terminate operators' denir.
    }

    public void fiyataGoreListele(){
        System.out.println("Fiyata Göre Sıralı Ürün Listesi");
        stream().sorted(Comparator.comparing(Urun::fiyat)).forEach(item -> System.out.println(item)); // declarative kodlama stream ile olur.
        System.out.println();
    }

    public void fiyataGoreTersSiraliListele(){
        System.out.println("Fiyata Göre Ters Sıralı Ürün Listesi");
        stream().sorted(Comparator.comparing(Urun::fiyat).reversed()).forEach(System.out::println);  // DK.
        System.out.println();
    }

    public void fiyataGoreTersveMiktaraGoreTersSiraliListele(){
        System.out.println("Fiyata ve Miktara Göre Ters Sıralı Ürün Listesi");
        stream().sorted(Comparator.comparing(Urun::fiyat).thenComparing(Urun::miktar).reversed()).forEach(System.out::println);
        System.out.println();
    }

    public List<Urun> head(int quantity){
        return stream().limit(quantity).collect(Collectors.toList());
    }

    public List<Urun> head(){
       return head(5);
    }

    public List<Urun> tail(int quantity){
        quantity = quantity < size() ? quantity : size();
        return stream().skip(size() - quantity).collect(Collectors.toList());
    }

    public List<Urun> tail(){
        return tail(6);
    }


}
