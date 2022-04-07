package meet5;

import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class InputApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int firstPrime;
        double litPI;
        String name;
        
        System.out.print("Input first prime number\t: ");
        firstPrime = scanner.nextInt();
        
        System.out.print("Input lit PI\t\t: ");
        litPI = scanner.nextDouble();
        
        System.out.print("Input your name\t\t: ");
        name = scanner.next();
        // `delimiter` = ' '
        
        System.out.println("firstPrime\t: " + firstPrime);
        System.out.println("litPI\t\t: " + litPI);
        System.out.println("Name\t\t: " + name);
        
        System.out.println("--------------------------");
        
        System.out.println("BAKAL NGEBUG KALO name");
        System.out.println("yang atas mengandung spasi");
        
        System.out.print("[2] Input your name\t\t: ");
        name = scanner.next();
        System.out.println("Name\t\t: " + name);
        
        System.out.print("[3] Input your name\t\t: ");
        name = scanner.next();
        System.out.println("Name\t\t: " + name);
    }
}
