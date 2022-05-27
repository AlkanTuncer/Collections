package day061.lists;

import java.util.Stack;

public class Main_Stack {
    public static void main(String[] args) {

        // Stack - Yığın
        // Last in First out - LIFO

        Stack<String> tabaklar = new Stack<>();
        tabaklar.push("Tabak 1");
        tabaklar.push("Tabak 2");
        tabaklar.push("Tabak 3");
        tabaklar.push("Tabak 4");
        tabaklar.push("Tabak 5");

        System.out.println(tabaklar+" -->Rafta duran tabaklar");

        System.out.println("En üstte duran tabak hangisidir? CEVAP : "+tabaklar.peek());

        String pop = tabaklar.pop();  // Tabak 5'i aldık.
        System.out.println("Pop metotu ile alınan tabak -> "+pop);

        System.out.println("En üstte duran tabak hangisidir? CEVAP : "+tabaklar.peek());

        tabaklar.pop();  // Tabak 4'ü aldık.
        tabaklar.pop();  // Tabak 3'ü aldık.

        System.out.println("En üstte duran tabak hangisidir? CEVAP : "+tabaklar.peek());
        System.out.println(tabaklar);

        tabaklar.push("Tabak 53");
        System.out.println("En üstte duran tabak hangisidir? CEVAP : "+tabaklar.peek());

    }
}
