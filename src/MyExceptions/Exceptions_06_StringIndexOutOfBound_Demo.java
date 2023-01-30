package MyExceptions;

public class Exceptions_06_StringIndexOutOfBound_Demo {
    public static void main(String[] args) {
        {
            try
            {
                String a ="This is like chipping";
                char c = a.charAt(2);
                System.out.println(c);
            }
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("StringIndexOutOfBoundsException..");
            }
        }
    }
}
