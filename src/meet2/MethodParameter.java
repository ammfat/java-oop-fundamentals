package meet2;

/**
 *
 * @author ammfat
 */
public class MethodParameter {
    public MethodParameter(String name, String version, int year) {
        // Constructor
        
        this.version = version;
        this.year = year;
        
        this.read(name);
    }
    
    String version;
    int year;
    
    void read(String name) {
        System.out.println(name + " is reading a book.");
    }
    
    void sayHi(String name, String campusName, int age) {
        System.out.println("Hi, my name is " + name
                + ". I am " + age + " years old.");
        System.out.println("I am from " + campusName);
    }
}
