import java.util.ArrayList;

public class ArrayLIstImpl {
    public static void main(String[] args)
    {
        String[] fruits = new String[5];
        fruits[0]= "Apple";
        fruits[1] = "Strawberry";
        fruits[2] = "Banana";
        fruits[3] = "Apple";
        System.out.println( fruits[3]);

        ArrayList fruitsList= new ArrayList();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Grapes");
        fruitsList.remove("Apple");
        fruitsList.contains("Strawberry");
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        //fruitsList.sort();
        System.out.println(fruitsList);
    }
}
