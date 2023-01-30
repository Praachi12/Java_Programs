package MyExceptions;

public class Exceptions_03_Throw {
    static void checkAge(int age)
    {
        if(age < 20) {

            throw new ArithmeticException("Access denied - You must be at least 18 years old");
        }
        else {
            System.out.println("Access granted : You are old enough");

        }
    }

    public static void main(String[] args) {
        checkAge(10);
    }
}
