package Ch_object;

public class EmployeeImpl {

    public static void main(String[] args)
    {
        Employee empOne = new Employee("Jane Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(25);
        empOne.empDesignation("Senior Java developer");
        empOne.empSalary(80000);
        empOne.printEmployee();
        empOne.salaryIncrement();

        empTwo.empAge(30);
        empTwo.empDesignation("Jr. Java developer");
        empTwo.empSalary(70000);
        empTwo.printEmployee();
        empTwo.salaryIncrement();
    }
}
