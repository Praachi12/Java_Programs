package Ch_object;

public class Student {
    String name;
    String gender;
    int age;
    String hairColor;
    public Student(String name, String gender, int age, String hairColor)
    {
        this.name= name;
        this.gender= gender;
        this.age= age;
        this.hairColor= hairColor;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String getHairColor(){
        return hairColor;
    }
    public String toString(){
        return("Hi my name is " + this.getName() + ".\nMy gender,age and hairColor are: " +
                this.getGender() + "," + this.getAge() + ","+ this.getHairColor());
    }

}


