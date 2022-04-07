package meet6;

/**
 *
 * @author ammfat
 */
public class ForLoopCharApp {
    public static void main(String[] args) {
        
        for (char c = '0'; c <= 'z'; c++) {
            System.out.println("Karakter: " + c);
        }
        
        for (var c = 'z'; c >= 'a'; c--) {
            System.out.println("Karakter: " + c);
        }
        
    }
}
