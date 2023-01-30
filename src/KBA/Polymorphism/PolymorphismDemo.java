package KBA.Polymorphism;

import org.w3c.dom.ls.LSOutput;

class Animal
{
    public void sound()
    {
        System.out.println("Every animal Makes different sound");
    }
}
class dog extends Animal{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}
class cat extends Animal {

    public void sound() {
        System.out.println("cat Meauw");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
         cat lily = new cat();
         lily.sound();
         dog abc = new dog();
         abc.sound();
    }
}
