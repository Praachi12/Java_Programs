package MyArrays;

import java.util.ArrayList;

public class Ex_02_Access_an_Item {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(0));
        System.out.println( cars.contains("Mazda"));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));


    }
}
