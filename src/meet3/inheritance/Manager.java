package meet3.inheritance;

/**
 *
 * @author ammfat
 */
public class Manager extends Employee {
    private int salary;
    private final String POSITION = "Manager";

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return POSITION;
    }
    
    // Overriding
    void sayHello() {
        System.out.println("Hi friends! I'm " + this.name
                + ". I work on " + this.department);
    }
}
