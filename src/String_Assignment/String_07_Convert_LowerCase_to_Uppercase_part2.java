package String_Assignment;

public class String_07_Convert_LowerCase_to_Uppercase_part2 {
    public static void main(String[] args) {
        String x = "prachi yeole";
        char[] y= x.toCharArray();
        int size= y.length;
        int i=0;
        while(i!=size)
        {
            //Check if there are spaces in an array
            if(y[i] != ' ')
            {
                y[i] = (char) (y[i]-32);
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);

    }

}
