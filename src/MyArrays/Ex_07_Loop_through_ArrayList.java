package MyArrays;

import java.util.ArrayList;

public class Ex_07_Loop_through_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("VM");
        cars.add("Nissan");
        System.out.println(cars);

        System.out.println("Displaying items using For each method : ");
        for(String i: cars)
        {
            System.out.println(i);
        }
    }

}
