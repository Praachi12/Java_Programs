package Assignment_ShoppingCart;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart1   {
    int i;
 /*   public void invoice(ArrayList<Enum> arrayList){
        ArrayList<String> arrayList1 = new ArrayList<>();
        System.out.println(arrayList1);
    }*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> cart = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String itemName = scanner.next();
            if (itemName.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Enter quantity for the item: ");
            int q = scanner.nextInt();
            System.out.println("Enter price for the item: ");
            int itemPrice = scanner.nextInt();
            Product p = new Product(itemName, q, itemPrice);
            //  int itemPrice = scanner.nextInt();
            //cart.set(itemName,itemPrice);
            cart.add(p);

        }

        System.out.println();
        System.out.println("Items in total: " + cart.size());
        System.out.println("No. of items are : ");

        for (Product p : cart) {
            System.out.println(p);
        }
        System.out.println("Invoice is ");
        for (Product p1 : cart)
        {
            System.out.println(p1 + "Amount is " + p1.getAmount());
    }


    }

}
