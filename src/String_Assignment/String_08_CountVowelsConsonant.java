package String_Assignment;

public class String_08_CountVowelsConsonant
{
    public static void main(String[] args)
    {
        String x = "AARADHYA'S BRILLIANCE CANTER";
        char[] y= x.toCharArray();
        int size= y.length;
        int vowcnt= 0;
        int conCnt = 0;
        int splChar = 0;
        int i = 0;
        while(i!= size)
        {
            if(y[i]>='A'&& y[i]<='Z')
            {
                if(y[i]=='A'|| y[i]=='E'||y[i]=='I' || y[i]=='O' ||y[i]=='U')
                {
                    vowcnt++;
                }
                else{
                    conCnt++;
                }
            }
            else
            {
                splChar++;
            }
            i++;
        }
        System.out.println(y);
        System.out.println("Vowel count is" + vowcnt);
        System.out.println("Consonant count is " + conCnt);
        System.out.println("Special character count is" + splChar);
    }
}
