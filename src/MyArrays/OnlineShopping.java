package MyArrays;
import java.util.Scanner;

//A team:
//Prachi, Sidiki, Bridgit, Nagwa, Nic, Sioeli

import java.util.ArrayList;

public class OnlineShopping {


    public static void main(String[] args) {
        ArrayList<String> Cart = new ArrayList<>();
        String item = "Rice";
        Cart.add("Juice");
        Cart.add("Water");

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to add item: ");
            System.out.println("Press 2 to remove: ");
            System.out.println("Press 3 to display: ");
            System.out.println("Exit");

            int choice = keyboard.nextInt();
              keyboard.next();
            switch (choice) {
                case 1:

                    String chooseItem = keyboard.nextLine();
                    Cart.add(item);
                    break;
                case 2:
                    if (Cart.size() == 0) {
                        System.out.println("Cart is Empty");
                    } else {
                        Cart.remove(item);
                    }
                    break;
                case 3:
                    for (String i : Cart) {
                        System.out.println(i);
                    }
                    break;
                case 4 : System.exit(0);

            }
        }





    }
}







