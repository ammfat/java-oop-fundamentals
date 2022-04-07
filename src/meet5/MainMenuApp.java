package meet5;

import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class MainMenuApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int pilihan;
        
        System.out.println("== MAIN MENU ==");
        System.out.println("----------------");
        System.out.println("[1] Pertambahan");
        System.out.println("[2] Pengurangan");
        System.out.println("[3] Perkalian");
        System.out.println("[4] Pembagian");
        System.out.println("[0] Keluar\n");
        
        System.out.println("Pilihan Anda : ");
        pilihan = scanner.nextInt();
        
        // rule switch
        // it would automatically `break` after a case have been done
        switch (pilihan) {
            case 1 -> System.out.println("++++++++");
            case 2 -> System.out.println("---------");
            case 3 -> System.out.println("***********");
            case 4 -> System.out.println("//////////");
            case 0 -> System.out.println("KELUAR PROGRAM");
            default -> System.out.println("Pilihan GADA");
        }
        
        /*
        if (pilihan == 1) {
            // 
        } else if (pilihan == 2) {
            //
        } else {
            //
        }
        */
        
        /*
        switch (pilihan) {
            case 1:
                System.out.println("++++++++");
        ...
        ...
                break
            case 2:
                System.out.println("---------");
                break;
            case 3:
                System.out.println("***********");
                break;
            case 4:
                System.out.println("//////////");
                break;
            case 0:
                System.out.println("KELUAR PROGRAM");
                break;
            default:
                System.out.println("Pilihan GADA");
        }
        */
    }
}
