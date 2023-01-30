package String_Assignment;

public class String_15_SwapTwoStrings {
    public static void main(String[] args) {
        String x= "ABC";
        String y = "XYZ";
        String temp = "";
        System.out.println("Before swapping :" +x);
        System.out.println("Before swapping :" +y);
        temp= x;
        x=y;
        y=temp;
        System.out.println("After swapping:" +x);
        System.out.println("Aftre swapping:" +y);

    }
}
