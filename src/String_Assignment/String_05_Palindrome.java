package String_Assignment;

import java.util.Locale;

public class String_05_Palindrome {
    public static void main(String[] args) {
        String x = "too Hot to Hoot";
        x= x.replace(" ","");
        x=x.toUpperCase();;
        char y[] = x.toCharArray();
        int size = y.length;
        char[] a = new char[size];
        int i = 0;
        while(i!=size)
        {
            a[size-1-i] = y[i];
            i++;
        }
        while(i!=size)
        {
            if(a[i]!= y[i])
            {
                System.out.println("Not a palindrome");
                System.exit(0);
            }
            else
            {
                i++;
                continue;
            }
        }
        System.out.println("Palindrome");
    }
}
