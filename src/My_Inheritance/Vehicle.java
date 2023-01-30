package My_Inheritance;

public class Vehicle
{
    protected String brand = "Ford";

    public String getColor() {
        return color;
    }

    private String color = "Red";
    // Vehicle attribute
    public void honk()
    {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }

}
