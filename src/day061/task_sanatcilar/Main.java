package day061.task_sanatcilar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {

        List<Sanatci> sanatcilar = Arrays.asList(
                new Sanatci("Şener Şen", 73),
                new Sanatci("Kemal Sunal", 82),
                new Sanatci("Filiz Akın", 116),
                new Sanatci("Fatma Girik", 180),
                new Sanatci("Kadir İnanır", 182),
                new Sanatci("Hülya Koçyiğit", 200),
                new Sanatci("Sadri Alışık", 209),
                new Sanatci("Münir Özkul", 215),
                new Sanatci("Türkan Şoray", 222),
                new Sanatci("Ali Şen", 290),
                new Sanatci("Cüneyt Arkın", 400),
                new Sanatci("Hulusi Kentmen", 500),
                new Sanatci("Erol Taş", 600),
                new Sanatci("Gülşen Bubikoğlu", 50),
                new Sanatci("Ediz Hun", 130),
                new Sanatci("Adile Naşit", 300),
                new Sanatci("Tarık Akan", 111)
        );

        long sanatciAdedi = sanatcilar.stream().count();
        System.out.println("Sanatçı Adedi : "+sanatciAdedi);

        long yuzdenAzFilmiOlan = sanatcilar.stream().filter(item -> item.filmAdedi() < 100).count();
        System.out.println("100'den az filmi olanlar : "+yuzdenAzFilmiOlan);

        List<Sanatci> yuzdenAzListe = sanatcilar.stream().filter(item -> item.filmAdedi() < 100).collect(Collectors.toList());
        System.out.println("100'den az filmi olanlar : "+yuzdenAzListe);

        sanatcilar.stream().sorted(Comparator.comparing(Sanatci::isim)).forEach(System.out::println);

        Optional<Sanatci> enCokFilmiOlan = sanatcilar.stream().max(Comparator.comparing(Sanatci::filmAdedi));
        System.out.println("En çok filmi olan : "+enCokFilmiOlan);

        Optional<Sanatci> enAzFilmiOlan = sanatcilar.stream().min(Comparator.comparing(Sanatci::filmAdedi));
        System.out.println("En az filmi olan : "+enAzFilmiOlan);

        double filmOrtalamasi = sanatcilar.stream().mapToDouble(Sanatci::filmAdedi).average().getAsDouble();
        System.out.println("Film Ortalaması : "+filmOrtalamasi);

    }
}

record Sanatci(String isim,int filmAdedi){}
