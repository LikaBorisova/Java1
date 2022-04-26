package Lesson5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String fN, String pos, String em, int phN, int sal, int ag) {
        fullName = fN;
        position = pos;
        email = em;
        phoneNumber = phN;
        salary = sal;
        age = ag;
    }

    public int getAge() {
        return age;
    }

    void printEmployee() {
        System.out.println("Full name: " + fullName);
        System.out.println("Postion: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
