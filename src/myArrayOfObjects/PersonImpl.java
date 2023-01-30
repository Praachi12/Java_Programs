package myArrayOfObjects;

import java.util.ArrayList;

public class PersonImpl {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person john = new Person("John");
        persons.add(john);
        persons.add(new Person("Mathew"));
        persons.add(new Person ("Martin"));
        for(Person person : persons)
        {
            System.out.println(person);
        }
    }
}
