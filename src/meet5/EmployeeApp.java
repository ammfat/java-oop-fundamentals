package meet5;

/**
 *
 * @author ammfat
 */
public class EmployeeApp {
    public static void main(String[] args) {
        var employee = new Employee();
        
        System.out.println("Name\t\t: " + employee.getName());
        System.out.println("Department\t: " + employee.getDepartment());
        System.out.println("Age\t\t: " + employee.getAge());
        
        employee.sayHello();
    }
}
