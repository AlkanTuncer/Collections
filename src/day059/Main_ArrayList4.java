package day059;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList4 {
    public static void main(String[] args) {

        // Remove
        List<Futbolcu> list = new ArrayList<>();
        list.add(new Futbolcu(7,"Cristiano Ronaldo"));
        list.add(new Futbolcu(9,"Ronaldo Nazario"));
        list.add(new Futbolcu(10,"Zinedine Zidane "));
        list.add(new Futbolcu(4,"Sergio Ramos"));

        Futbolcu fake7 = new Futbolcu(7,"Kylian Mbappe");
        list.add(fake7);

        for(var item : list) System.out.println(item);
        System.out.println();

        list.remove(1);
        list.remove(fake7);
        for(var item : list) System.out.println(item);


    }
}

record Futbolcu(int jerseyNumber,String name){}

