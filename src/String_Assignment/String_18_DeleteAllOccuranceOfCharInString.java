package String_Assignment;

public class String_18_DeleteAllOccuranceOfCharInString {
    public static void main(String[] args) {
        String x= "SPIDERSLIES";
        char[] y = x.toCharArray();
        int size = x.length();
        char key = 'S';
        int i = 0;
        String res = "";
        while(i != size)
        {
            if(y[i] != key)
            {
                res = res + y[i];
            }
            i++;
        }
        System.out.println(res);

    }
}
