package day061.queues;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main_Queue {
    public static void main(String[] args) {

        // Queue - Sıra
        // First in First out - FIFO

        Queue<String> printer = new LinkedList<>();
        printer.offer("Sayfa 1");
        printer.offer("Sayfa 2");
        printer.offer("Sayfa 3");

        printer.stream().sorted(Comparator.comparing(Object::toString)).forEach(System.out::println);
        printer.stream().sorted(Comparator.comparing(Object::toString).reversed()).forEach(System.out::println);

        System.out.println("İlk bastırılacak sayfa : "+printer.peek());

        String sayfa = printer.poll();
        System.out.println(sayfa+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");
        System.out.println(printer.poll()+" bastırılıyor.");  // 'null bastırılıyor' olur. Kontrolü yapılır.



    }
}
