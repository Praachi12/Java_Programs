package Ch_object;

public class Dog {

    String name;
    String breed;
    int age;
    String color;
    public Dog(String name, String breed, int age, String color)
    {
        this.name= name;
        this.breed = breed;
        this.age= age;
        this.color= color;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return("Hi my name is " + this.getName() + ".\nMy breed,color and age are "+
                this.getBreed() + "," + this.getColor() + ","+ this.getAge());
    }

}
