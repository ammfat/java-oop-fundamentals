package meet1;

/**
 *
 * @author ammfat
 */
public class VariablesApp {
    public static void main(String[] args) {
        // 1. PRIMITIVE
        // int, byte, float, double, char, boolean
        // int -> -3000 .. 3000        
        
        // 2. OBJECT
        // Integer, Float, String
        // Integer -> -5000 .. 5000
        
        byte thisIsByte;
        thisIsByte = 50;
        
        int thisIsInt = 100;

        float thisIsFloat = 3.14f;
        double thisIsDouble = 3.14;

        char thisIsChar = 'a';
        String thisIsString = "Hi, Universe!";

        boolean thisIsBoolean = true;

        System.out.println("byte\t: " + thisIsByte);
        System.out.println("float\t: " + thisIsFloat);
        System.out.println("char\t: " + thisIsChar);
        System.out.println("String\t: " + thisIsString);
        System.out.println("boolean\t: " + thisIsBoolean);
        System.out.println("double\t: " + thisIsDouble);
    }
}
