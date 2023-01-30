package Ch_object;

public class ClassInJavaImpl {
    public static void main(String[] args)
    {
        ClassInJava s1= new ClassInJava("Ms.Prachi", 20,"Mr.Dilip", "+1-987454321",
                "Dallas" );
        System.out.println("Student name is  : " + s1.name);
        System.out.println("Student rollno is: " + s1.rollNo);
        System.out.println("Father name is   : " + s1.fatherName);
        System.out.println("Contact is       : " + s1.contactNo);
        System.out.println("Address is       : " + s1.address);


    }
}
