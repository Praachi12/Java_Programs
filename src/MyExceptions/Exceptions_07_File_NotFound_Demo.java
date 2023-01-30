package MyExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions_07_File_NotFound_Demo {
    public static void main(String[] args) {
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
    }
}
