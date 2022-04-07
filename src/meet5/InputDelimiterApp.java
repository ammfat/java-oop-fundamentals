package meet5;

import java.util.Scanner;

/**
 *
 * @author ammfat
 * @github github.com/ammfat
 */
public class InputDelimiterApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        // Configure the `delimiter` to "\n"
        // so .next() could accept space character
        scanner.useDelimiter("\n");
        
        int firstPrime;
        double litPI;
        String name;
        
        System.out.print("1st prime num\t: ");
        firstPrime = scanner.nextInt();

        System.out.print("lit PI\t\t: ");
        litPI = scanner.nextDouble();

        System.out.print("Your name\t: ");
        name = scanner.next();

        System.out.println("firstPrime\t: " + firstPrime);
        System.out.println("litPI\t\t: " + litPI);
        System.out.println("Name\t\t: " + name);

        System.out.println("--------------------------");

        System.out.print("[2] Your name\t: ");
        name = scanner.next();
        System.out.println("Name\t\t: " + name);
        
        System.out.print("[3] Your name\t: ");
        name = scanner.next();
        System.out.println("Name\t\t: " + name);
        
    }
}
