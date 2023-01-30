package String_Assignment;

public class String_11_RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String x = "Join ABC  Get Skilled";
        x= x.replaceAll("\\s","");
        System.out.println(x);

    }
}
