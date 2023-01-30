package KBA;
abstract class Dog{
    public void bark()
    {
        System.out.println("Dog is barking..");
    }
    public abstract void jump();
}
class Abc extends Dog{
  /*  public void bark()
    {
        System.out.println("Dog is still barking");
    }*/
    public void jump()
    {
        System.out.println("Dog is jumping");
    }
}
public class AbstractTutorial implements DogInterface{
    public static void main(String[] args) {
        AbstractTutorial ab = new AbstractTutorial();

        Abc dog1 =new Abc();
        dog1.bark();
        dog1.jump();
        ab.bark();



    }

    @Override
    public void bark() {
        System.out.println("This dog is barking so loudly");
    }
}
