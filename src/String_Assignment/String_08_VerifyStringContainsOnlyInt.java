package String_Assignment;

public class String_08_VerifyStringContainsOnlyInt {
    public static void main(String[] args) {

        String x = "ABC123";
        char[] y= x.toCharArray();
        int size= y.length;
        int i=0;
        while(i!=size)
        {
            if(y[i]>= '0'&& y[i]<='9')
            {
                i++;
            }
            else
            {
                System.out.println("Not an Integer String");
                System.exit(0);
            }
            System.out.println("Integer String");

        }
    }
}
