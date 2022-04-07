package meet3.inheritance;

/**
 *
 * @author ammfat
 */
public class Employee {
    String name;
    String department;
    
    void sayHello() {
        System.out.println("Hello! I'm " + this.name
                            + ". I work on " + this.department);
    }
}
