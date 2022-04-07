package meet6;

/**
 *
 * @author ammfat
 */
public class WhileLoopApp {
    public static void main(String[] args) {
        int total_genap = 0, total_ganjil = 0;
        int i = 20;

        System.out.println("While Loop (20 - 0)");
        
        while (i >= 0) {
            System.out.print(i + ", ");

            if (i % 2 == 0) {
                total_genap += i;
            } else {
                total_ganjil += i;
            }
            
            i--;
        }
        
        System.out.println("");
        System.out.println("Deret Genap: " + total_genap);
        System.out.println("Deret Ganjil: " + total_ganjil);

        
    }
}
