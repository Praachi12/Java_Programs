package String_Assignment;

public class Compute_01_String_length {
    public static void main(String[] args) {
        String x = "ABC tech";
        x= x.concat("\0");
        char[] y = x.toCharArray();
        int i= 0;
        int count = 0;
        while(y[i] !=0)
        {
            i++;
            count++;
        }
        System.out.println(count);

    }
}
