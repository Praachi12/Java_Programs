package MyArrays;

import java.util.ArrayList;

public class Ex_05_ArrayList_size {
    public static void main(String[] args) {


        ArrayList<String> shopping_cart = new ArrayList<>();
        shopping_cart.add("Milk");
        shopping_cart.add("Bread");
        shopping_cart.add("Cheese");
        shopping_cart.add("Rice");
        shopping_cart.add("Olive oil");
        shopping_cart.add("Oats");

        System.out.println(shopping_cart);
        System.out.println("Displaying items using For each method : ");
        for(String item: shopping_cart)
        {
            System.out.println(item);
        }
        System.out.println("Displaying items Using regular for loop:");
        for (int i=0 ; i < shopping_cart.size(); i++)
        {
            System.out.println(shopping_cart.get(i));
        }
        System.out.println("Number of items in your cart are : " + shopping_cart.size());
        if (shopping_cart.size()<=4 )
        {
            System.out.println("No discount applied");
        } else if (shopping_cart.size()>=5 && shopping_cart.size()<=10)
        {
            System.out.println("You have discount of 20%");
        } else if (shopping_cart.size()>11) {
            System.out.println("You have a discount of 30%");

        }


    }


}
