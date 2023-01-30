package MyExceptions;

import java.util.Scanner;

public class Exceptions_10_IOExceptions_demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner("Hello Geek");
        System.out.println("" + scan.nextLine());
        System.out.println("Exception Output:" + scan.ioException());
        scan.close();
    }
}
