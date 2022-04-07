package meet4.overloading;

/**
 *
 * @author ammfat
 */
public class Employee {
    
    Employee(String name, String department) {
        setName(name);
        setDepartment(department);
    }
    
    Employee(String name, String department, int salary) {
        this(name, department);
        setSalary(salary);
    }

    String name;
    String department;
    int salary = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            this.salary = 0;
        }
        
        this.salary = salary;
    }

    String sayHello() {
        return "Hello! I'm " + this.name + ". "
                + "I work on " + this.department + ". ";
    }
    
    /*
    OVERLOADING : Parameter tiap method berbeda
    */
    
    String sayHello(int age) {
        return this.sayHello()
                + "I am " + age + " years old";
    }
    
    String sayHello(int age, double height) {
        return this.sayHello(age)
                +"and " + height + " tall";
    }
}
