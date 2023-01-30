package myArrayOfObjects;

public class Student
{
 public int id;
 public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void display() {
        System.out.println("Student id is: " + id + " "
        + " and Student name is: " + name);
        System.out.println();
    }
}
