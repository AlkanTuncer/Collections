package day058;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {

        // ArrayList

        // ArrayList Creation
        ArrayList list = new ArrayList();
        list.add("Dante");
        String isim =(String) list.get(0);
        System.out.println(isim);

        /* Generic Kullanım
             ArrayList<Type> list = new ArrayList<>();
         */
        ArrayList<String> kisiler = new ArrayList<>();
        kisiler.add("Alkan");
        kisiler.add("Çağlasu");

        String str = kisiler.get(1);

        // İlkel Tiplerin Kullanımı
        // Byte - Short - Integer - Long
        // Double - Float
        // Boolean
        // Character (char için)

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(53);
        sayilar.add(17);

    }
}
