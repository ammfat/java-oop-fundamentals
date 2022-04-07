package meet5;

import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    
    Employee() {
        this.setName();
        this.setDepartment();
        this.setAge();
    }

    private String name;
    private String department;
    private int age;

    public String getName() {return name;}

    public void setName() {
        System.out.print("Name\t\t: ");
        this.name = scanner.nextLine();
    }

    public String getDepartment() {return department;}

    public void setDepartment() {
        System.out.print("Department\t: ");
        this.department = this.scanner.nextLine();
    }

    public int getAge() {return age;}

    public void setAge() {
        System.out.print("Age\t\t: ");
        this.age = scanner.nextInt();
    }

    void sayHello() {
        System.out.println("Hello! I'm " + this.name + " ."
                + "I work on " + this.department + " .");
    }
}
