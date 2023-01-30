package String_Assignment;

import java.util.Arrays;

public class String_10_AnagramProgram {
    public static void main(String[] args) {
        String x = "He IS aRadhya";
        String y = " is He HraDaya";
        x= x.replace(" ", "");
        y= y.replace(" ","");

        x = x.toLowerCase();
        y = y.toLowerCase();

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a,b);
        if(result == true)
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }
    }
}
