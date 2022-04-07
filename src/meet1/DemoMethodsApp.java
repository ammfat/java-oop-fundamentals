package meet1;

/**
 *
 * @author ammfat
 */
public class DemoMethodsApp {
    public static void main(String[] args) {
        DemoMethods demo = new DemoMethods();
        
        demo.name = "Maul";
        demo.birthYear = 2000;
        
        demo.sayHi();
        
        int age = demo.getAge();
        
        // System.out.println(demo.getAge());        
        System.out.println(age);
    }
}
