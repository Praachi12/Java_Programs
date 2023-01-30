package MyExceptions;

public class Exceptions_12_ClassNotFoundException {
    public static void main(String[] args) {
        try
        {
            Class.forName("Class1");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Class 1 not found");
            e.printStackTrace();
        }
    }
}
