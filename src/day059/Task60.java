package day059;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task60 {
    public static void main(String[] args) {

        ArrayList<Personel> calisanlar = new ArrayList<>();
        calisanlar.add(new Personel("Ronaldo",5300.0));
        calisanlar.add(new Personel("Messi",5000.0));
        calisanlar.add(new Personel("Neymar",4500.0));
        calisanlar.add(new Personel("Ramos",4000.0));
        calisanlar.add(new Personel("Nunez",1000.0));

        List<Personel> m5000 = new ArrayList<>();

        for (var item : calisanlar){
            if (item.maas() > 5000.0){
                m5000.add(item);
            }
        }

        Iterator<Personel> iterator = m5000.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
record Personel(String isim,double maas){}
