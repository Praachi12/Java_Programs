package Exception_Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_Demo6_part2 {
    public static void main(String[] args) {
        File f =new File("myfile2.txt");
        Scanner fs = null;
        try {
             fs= new Scanner(f);
            System.out.println(fs.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        finally
        {
            if(fs!=null)
            fs.close();

        }
    }
}
