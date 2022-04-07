package meet1;

/**
 *
 * @author ammfat
 */
public class DemoMethods {
    String name;
    int birthYear;
    
    void sayHi() {
        System.out.println("Hi! My name is " + name);
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        System.out.println(birthYear);
        
        return 2022 - birthYear;
    }
}
