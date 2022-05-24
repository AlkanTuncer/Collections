package day058.otomobilgalerisi;

import java.util.Iterator;
import java.util.Objects;

public class ShowRoom implements Iterable<Car>{

    private Car[] cars;
    private int count;
    private static final int DEFAULT_CAPACITY = 10;

    public ShowRoom(int capacity) {
        cars = new Car[capacity];
    }

    public ShowRoom() {
        this(DEFAULT_CAPACITY);
    }

    public int capacity(){
        return cars.length;
    }

    public int size(){
        return count;
    }

    public void add(Car car){
        cars[count++] = car;
        if (size() == capacity()/2+1){
            Car[] tmp = new Car[size()];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = cars[i];
            }
            cars = new Car[capacity()*2];
            for (int i = 0; i < tmp.length; i++) {
                cars[i] = tmp[i];
            }
        }
    }

    public boolean remove(Car car){
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (car.equals(cars[i])){
                index = i;
            }
        }
        return remove(index);
    }

    public boolean remove(int index){
        boolean result = false;
        //cars[index] = null;
        if (index >= 0 && index < size()) {
            for (int i = index + 1; i < size(); i++) {
                cars[i - 1] = cars[i];
            }
            cars[--count] = null;
            result = true;
        }
        return result;
    }

    public Car get(int index){
        Objects.checkIndex(index,count);
        return cars[index];
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car>{

        private int index;

        @Override
        public boolean hasNext() {
            return (index < count);
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
