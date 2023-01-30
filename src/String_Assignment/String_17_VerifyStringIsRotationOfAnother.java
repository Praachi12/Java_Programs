package String_Assignment;

public class String_17_VerifyStringIsRotationOfAnother {
    public static void main(String[] args) {
        String originalString = "aaradhya";
        String keyString = "dhyaraa";
        String newString = originalString.concat(originalString);
        if(newString.contains(keyString))
        {
            System.out.println("Rotational String");
        }
        else
            System.out.println("Non-Rotational String");
    }
}
