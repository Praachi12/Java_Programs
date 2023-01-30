package Ch_object;

public class MobileImpl {
    public static void main(String[] args)
    {
        Mobile abc= new Mobile("Motorola", "Black",1);
        Mobile xyz= new Mobile("Apple", "red", 3);
        System.out.println("abc own mobile : " + abc.brand + " color is: " + abc.color + "having camera : "
        + abc.camera);
        System.out.println("xyz own mobile:" + xyz.brand + "color is: " + xyz.color + "having camera : "
                + xyz.camera);

    }
}
