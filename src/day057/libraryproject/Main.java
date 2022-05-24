package day057.libraryproject;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.add(new Book(1,"Kitap 1"));
        library.add(new Book(2,"Kitap 2"));
        library.add(new Book(3,"Kitap 3"));

        System.out.println("Size : "+library.size());
        System.out.println("Capacity : "+library.capacity());

        for (var item : library){
            System.out.println(item);
        }


        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
