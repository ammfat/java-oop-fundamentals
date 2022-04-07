package meet6;

/**
 *
 * @author ammfat
 */
public class ForLoopApp {
    public static void main(String[] args) {
        int total_genap = 0, total_ganjil = 0;
                
        System.out.println("For Loop (0 - 20)");
        
        //                         ,-> POST STATEMENT
        for (var i = 0; i <= 20; i++) {
            System.out.print(i + ", ");
            
            if (i % 2 == 0) {
                total_genap += i;
            } else {
                total_ganjil += i;
            }
        }
        
        System.out.println("");
        System.out.println("Deret Genap: " + total_genap);
        System.out.println("Deret Ganjil: " + total_ganjil);
        
        System.out.println("------------------------");
        
        total_genap = 0;
        total_ganjil = 0;
        
        for (int i = 0; i <= 20; i+=2) {
            System.out.print(i + ", ");
            total_genap += i;
        }
        
        System.out.println("");
        
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + ", ");
            total_ganjil += i;
        }
        
        System.out.println("");
        System.out.println("Deret Genap: " + total_genap);        
        System.out.println("Deret Ganjil: " + total_ganjil);
    }
}
