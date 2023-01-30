package Ch_object;

public class Lamp {
    boolean isOn;

    void turnOn()
    {
    isOn= true;
    System.out.println("Lamp is on :" + isOn);
    }

    void turnOff()
    {
        isOn= false;
        System.out.println("Lamp is on :" + isOn);
    }
}
