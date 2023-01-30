package Exception_Homework;

public class Exception_Demo4 {
    public static void main(String[] args) {

        int x = 0;
        try {
            x = divide(6, 0);
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }

        System.out.println(x);
    }
    public static int divide(int a, int b) throws ArithmeticException
    {
        return a/b;
    }
}

