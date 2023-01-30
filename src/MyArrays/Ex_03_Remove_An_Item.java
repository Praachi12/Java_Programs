package MyArrays;

import java.util.ArrayList;

public class Ex_03_Remove_An_Item {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("VM");
        cars.add("Nissan");
        System.out.println(cars);
        cars.remove(3);
        System.out.println(cars);


    }
}
