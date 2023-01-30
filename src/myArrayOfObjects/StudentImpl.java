package myArrayOfObjects;

import java.util.ArrayList;

public class StudentImpl {
    public static void main(String[] args) {
  ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"Prachi");
        Student s2 = new Student(2,"ABC");
        list.add(s1);
        list.add(s2);
        for(Student s : list)
        {
            System.out.println(s);
        }
       // System.out.println(list.);
        Student[] arr;
        arr = new Student[2];
        arr[0] = new Student(1,"Prachi");
        arr[1] = new Student(2, "Om");
        System.out.println("Student data in student arr 0: ");
        arr[0].display();
        System.out.println("Student data in student arr 1: ");
    arr[1].display();

    }
}
