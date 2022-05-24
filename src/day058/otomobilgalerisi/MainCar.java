package day058.otomobilgalerisi;

import java.util.Iterator;

public class MainCar {
    public static void main(String[] args) {

        ShowRoom showRoom2 = new ShowRoom();  // Capacity = DEFAULT_CAPACITY '10'.
        ShowRoom showRoom = new ShowRoom(50);

        showRoom.add(new Car(1,"Audi A5"));
        showRoom.add(new Car(2,"BMW M3"));
        showRoom.add(new Car(3,"Mercedes E500"));
        showRoom.add(new Car(4,"VW Amarok"));
        showRoom.add(new Car(5,"Audi A3"));

        for(var item : showRoom){
            System.out.println(item);
        }
        System.out.println("Size : "+showRoom.size());

        System.out.println();

        Iterator<Car> iterator = showRoom.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        showRoom.forEach(item -> System.out.println(item));   // Burdaki bütün döngüler aynıdır. Hepsi iterator ile oluyor.
        showRoom.forEach(System.out :: println);


        showRoom.remove(2);
        for(var item : showRoom){
            System.out.println(item);
        }
        System.out.println("Size : "+showRoom.size());

        Car c1 = new Car(4,"VW Amarok");
        showRoom.remove(c1);
        for(var item : showRoom){
            System.out.println(item);
        }


    }
}
