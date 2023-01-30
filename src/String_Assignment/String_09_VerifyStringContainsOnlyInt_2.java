package String_Assignment;

public class String_09_VerifyStringContainsOnlyInt_2 {
    public static void main(String[] args) {

        String x = "123";

        int size= x.length();
        int i=0;
        while(i!=size)
        {
            if(x.charAt(i)>= '0'&& x.charAt(i)<='9')
            {
                i++;
            }
            else
            {
                System.out.println("Not an Interger String");
                System.exit(0);
            }

        }
        System.out.println("Integer String");
    }
}
