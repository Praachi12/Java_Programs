package Exception_Homework;

public class Exception_Demo2
{
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        try {
            System.out.println(x / y);
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero.");
        }
        System.out.println("The End");
    }

}
