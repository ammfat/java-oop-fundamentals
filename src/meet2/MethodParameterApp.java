package meet2;

/**
 *
 * @author ammfat
 */
public class MethodParameterApp {
    public static void main(String[] args) {
        // MethodParameter demo = new MethodParameter();
        var demo = new MethodParameter("Alpin", "1.1", 2022);
        
        System.out.println(demo.version);
        System.out.println(demo.year);
        
        
        
        
        demo.read("Budi");
        demo.read("Azki");
        
        demo.sayHi("Maul", "Unsika", 21);
        demo.sayHi("Yuli", "MIT", 20);
        
        String myName; // declaration
        myName = "Maul"; // assignment
        
        var myAge = 31; // declare + assign
        var myCampus = "UBP"; // declar + assign
        
        demo.sayHi(myName, myCampus, myAge);
        
    }
}
