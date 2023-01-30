package String_Assignment;

public class String_06_Convert_LowerCase_to_Uppercase {
    public static void main(String[] args) {
        String x = "prachi";
        char[] y= x.toCharArray();
        int size= y.length;
        int i=0;
        while(i!=size)
        {
            y[i] = (char) (y[i]-32);
            i++;
        }
        System.out.println(x);
        System.out.println(y);

    }

}
