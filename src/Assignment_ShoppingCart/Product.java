package Assignment_ShoppingCart;




import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    //Declare the variables
    public int itemPrice;
    public int itemQuantity;
    public String itemName;

    public Product(String itemName, int itemQuantity, int itemPrice) {

        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getAmount()
    {
        int amount = itemQuantity*itemPrice;
        return amount;
    }
}






