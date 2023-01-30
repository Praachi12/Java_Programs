package String_Assignment;

public class String_07_Convert_LowerCase_to_Uppercase_part3 {
    public static void main(String[] args) {
        String x = "aaradhya brilliance center";
        char[] y= x.toCharArray();
        int size= y.length;
        y[0]= (char)(y[0]-32);
        int i=1;
        while(i!=size)
        {
            //Check if there are spaces in an array
            if(y[i] == ' ')
            {
                y[i+1] = (char) (y[i+1]-32);
            }
            i++;
        }
        System.out.println(x);
        System.out.println(y);

    }

}

