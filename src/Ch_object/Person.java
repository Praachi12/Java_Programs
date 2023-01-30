package Ch_object;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name)
    {
        this.name = name;
        this.age = 0 ;
        this.weight= 0;
        this.height= 0;
    }

    public Person(String name, int age, int weight, int height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder(){
        this.age = this.age + 1;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    public String toString(){
        return this.name + ", age " + this.age + " years";
    }

    public void bodyMassIndex()
    {
        double heightDivByHundred = this.height / 100.0;
        double bmi = this.weight / heightDivByHundred * heightDivByHundred;
        System.out.println(" Body mass index is " + bmi);
    }

}
