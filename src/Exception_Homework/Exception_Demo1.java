package Exception_Homework;

public class Exception_Demo1 {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 11, 50, 23};

        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The End.");
        }
    }

}
