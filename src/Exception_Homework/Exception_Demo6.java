package Exception_Homework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_Demo6 {
    public static void main(String[] args) {
        PrintWriter pw= null;
        try
        {
            pw = new PrintWriter("myfile.txt");
            pw.println("Hello world");

        }catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            pw.close();
        }

    }
}
