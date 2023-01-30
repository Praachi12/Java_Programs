package KBA.SuperKeyword;

import My_Inheritance.Vehicle;

class vehicle
{
    int maxSpeeed;
    vehicle()
    {
        System.out.println("Vehicle Constructor");
    }
    vehicle(int maxSpeeed)
    {
        System.out.println("Vehicle constructor");
        this.maxSpeeed = maxSpeeed;
    }
}

class Car extends vehicle{
    Car(){
        super();
        System.out.println("Car constructor");
    }

}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car Honda = new Car();
        vehicle Nissan = new vehicle(200);
        System.out.println(Nissan.maxSpeeed);
    }
}
