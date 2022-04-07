package meet5;

import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class InputMoreApp {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int firstPrime;
        double litPI;
        String name, campus;

        System.out.print("Your name\t\t: ");
        name = scanner.nextLine();
        // `delimiter` = '\n'
        
        System.out.print("Campus\t\t: ");
        campus = scanner.nextLine();
        
        System.out.print("Input first prime number\t: ");
        firstPrime = scanner.nextInt();

        System.out.print("Input lit PI\t\t: ");
        litPI = scanner.nextDouble();

        System.out.println("Name\t\t: " + name);
        System.out.println("Campus\t\t: " + campus);
        System.out.println("firstPrime\t: " + firstPrime);
        System.out.println("litPI\t\t: " + litPI);

    }
}
