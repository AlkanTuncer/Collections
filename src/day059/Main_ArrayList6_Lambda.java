package day059;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_ArrayList6_Lambda {
    public static void main(String[] args) {

        List<Personel> calisanlar = List.of(
                new Personel("Cristiano Ronaldo",7000.0),
                new Personel("Lionel Messi",5300.0),
                new Personel("Neymar Jr.",5000.0),
                new Personel("Sergio Ramos",4000.0),
                new Personel("Darwin Nunez",1300.0)
        );

        calisanlar.forEach(calisan -> System.out.println(calisan));

     /*
        calisanlar.forEach(p -> {
            if (p.maas() > 5000) System.out.println(p);
        });
     */

        calisanlar.stream().filter(item -> item.maas() >= 5000).forEach(item -> System.out.println(item));


        List<Personel> list = calisanlar.stream()
                .filter(item -> item.maas() > 5000)
                .sorted(Comparator.comparing(Personel::maas).reversed())
                .collect(Collectors.toList());
              //.forEach(item -> System.out.println(item));

        for (var item : list) System.out.println(list);


        calisanlar.stream().sorted(Comparator.comparing(Personel::isim)).forEach(item -> System.out.println(item));

    }
}
