package Exception_Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Demo3 {
    public static void main(String[] args) {
        try {
                int[] arr = {2};
                arr[4] = 7;

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a number");
            int x = keyboard.nextInt();
            System.out.println("Enter another number");
            int y = keyboard.nextInt();
            System.out.println("The value of " + x + "/" + y + "is" + (x / y));
        }
        catch(InputMismatchException e)
        {
            System.out.println("You entered invalid integer");
        }
        catch(ArithmeticException e)
        {
            System.out.println("you cannot divide by zero");

        }
        catch( Throwable e)
        {
            System.out.println("Some other issue happened");
        }

    }
}
