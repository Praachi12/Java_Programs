package Ch_object;

public class PersonImpl {
    public static void main(String[] args)
    {
        Person Parth = new Person("Parth", 70,55,5);

        System.out.println( Parth.toString());

        Parth.bodyMassIndex();
    }
}
