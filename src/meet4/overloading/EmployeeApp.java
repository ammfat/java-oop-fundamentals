package meet4.overloading;

/**
 *
 * @author ammfat
 */
public class EmployeeApp {
    public static void main(String[] args) {
        /*
        var fadil = new Employee();

        fadil.name = "Fadil";
        fadil.department = "Software Dev.";
        */
        
        String name;
        String department;
        
        name = "Fadil";
        department = "Research and Development";
        
        var fadil = new Employee(name, department);
        
        System.out.println(fadil.sayHello());
        System.out.println(fadil.sayHello(21));
        System.out.println(fadil.sayHello(21, 168.2));        
        System.out.println("Fadil's salary : " + fadil.getSalary());
        
        System.out.println("--------------------------");
        
        name = "Nurul";
        department = "DevOps";
        int salary = 10_000_000;
        
        var nurul = new Employee(name, department, salary);
        
        System.out.println(nurul.getName());
        System.out.println(nurul.getDepartment());
        System.out.println(nurul.getSalary());        
    }
}
