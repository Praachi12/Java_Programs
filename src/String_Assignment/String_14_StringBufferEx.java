package String_Assignment;

public class String_14_StringBufferEx {
    public static void main(String[] args) {
        StringBuffer x= new StringBuffer("ABC");
        StringBuffer y = new StringBuffer("XYZ");
        x.append(y);
        System.out.println(x);
    }
}
