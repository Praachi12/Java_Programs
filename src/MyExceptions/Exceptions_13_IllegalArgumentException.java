package MyExceptions;

public class Exceptions_13_IllegalArgumentException {
    public static void print(int a)
    {
        if(a>=18)
        {
            System.out.println("Eligible for Voting");
        }
        else
        {

            throw new IllegalArgumentException("Not Eligible for Voting");


        }

    }
    public static void main(String[] args) {
        Exceptions_13_IllegalArgumentException.print(18);

    }
}


