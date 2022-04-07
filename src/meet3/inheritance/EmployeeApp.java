package meet3.inheritance;

/**
 *
 * @author ammfat
 */
public class EmployeeApp {
    public static void main(String[] args) {
        var fadil = new Employee();
        
        fadil.name = "Fadil";
        fadil.department = "Software Dev.";
        fadil.sayHello();
        
        var gani = new Manager();
        
        gani.name = "Gani";
        gani.department = "Software Dev.";
        gani.sayHello();
        System.out.println(gani.getPosition());
        
        gani.setSalary(6_000_000);
        System.out.println(gani.getSalary());
    }
}
