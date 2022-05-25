package day059;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList5 {
    public static void main(String[] args) {

        List<Personel> calisanlar = List.of(
                new Personel("Cristiano Ronaldo",7000.0),
                new Personel("Lionel Messi",5300.0),
                new Personel("Neymar Jr.",5000.0),
                new Personel("Sergio Ramos",4000.0),
                new Personel("Darwin Nunez",1300.0)
        );

        List<Personel> personelList = new ArrayList<>(calisanlar);

        Personel remove = personelList.remove(4);  // Sildiğim üyenin referansını elimde tutabilirim.
        for (var item : personelList){
            System.out.println(item);
        }

        System.out.println();
        System.out.println(remove);

    }
}
