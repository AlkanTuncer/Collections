package day060.yazarkasa;

import java.util.Collections;
import java.util.List;

public class MainStok {
    public static void main(String[] args) {

        Stok myStok = new Stok();
        Collections.addAll(myStok,Urun.stokHazirla().toArray(new Urun[0]));

        myStok.listele();
        myStok.isimSiraliListele();
        myStok.fiyataGoreListele();
        myStok.fiyataGoreTersSiraliListele();
        myStok.fiyataGoreTersveMiktaraGoreTersSiraliListele();

        List<Urun> head = myStok.head();
        head.stream().forEach(System.out::println);

        System.out.println();

        List<Urun> head1 = myStok.head(2);
        head1.stream().forEach(System.out::println);

        System.out.println();

        List<Urun> tail = myStok.tail(2);
        tail.stream().forEach(System.out::println);

    }
}
