package MyArrays;

import java.util.ArrayList;

public class Ex_03_Change_An_Item {
    public static void main(String[] args) {
        ArrayList<String> shopping_cart = new ArrayList<>();
        shopping_cart.add("Milk");
        shopping_cart.add("Bread");
        shopping_cart.add("Cheese");
        shopping_cart.add("Rice");
        shopping_cart.add("Olive oil");
        shopping_cart.add("Oats");
        System.out.println(shopping_cart);
        //Changing Item in cart

        shopping_cart.set(2, "Juice");
        System.out.println("List after changing item at index 2 :");
        System.out.println(shopping_cart);
        shopping_cart.remove(4);

        System.out.println("Items after removing item at index 4: " + shopping_cart);

        shopping_cart.clear();
        System.out.println("Updated list is: ");
        shopping_cart.add("banana");
        shopping_cart.add("Butter");
        for (String item : shopping_cart) {
            System.out.println(item);
        }

    }
}
