package String_Assignment;

public class LoopsInJavaEx {
    public static void main(String[] args) {
        {
            int[] a ={10,20,30,50};
            int sum=0;

            //Using for loop
            for(int i= 0; i<a.length ; i++)
            {
                sum= sum+ a[i];
            }
            System.out.println("Answer using for loop :" + sum);
            //while loop
            int j =0,sum1= 0;
            while( j!= a.length )
            {
                sum1 = sum1+ a[j];
                j++;
            }
            System.out.println("Answer using while loop :" + sum1);

            //do- while loop
            int x= 0,sum2 = 0;
            do {

                sum2 = sum2 + a[x];
                x++;
            }while (x!= a.length);
            System.out.println("Answer using do while loop :" + sum2);

            //for each loop
            int res = 0;
            for(int data:a)
            {
                res = res + data;
            }
            System.out.println("Answer using for each loop :" + res);
        }
    }
}
