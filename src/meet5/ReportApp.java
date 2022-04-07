package meet5;

import java.util.Scanner;


/**
 *
 * @author ammfat
 */
public class ReportApp {
    public static void main(String[] args) {
        // jangan lupa di-import dulu ges: java.util.Scanner
        var scanner = new Scanner(System.in);
        
        int examScore;
        int distance = 10;
        char grade;
        boolean isPassed;
        
        System.out.print("Exam Score: ");
        examScore = scanner.nextInt();
        
        if (examScore >= 90 & distance <= 10) {
            grade = 'A';
        } else if (examScore >= 80) {
            grade = 'B';
        } else if (examScore >= 70) {
            grade = 'C';
        } else if (examScore >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        // Ternary operators
        isPassed = examScore >= 70 ? true : false;        
        
        System.out.println("Grade\t: "+ grade);        
        System.out.println("Is Passed\t: " + isPassed);
    }    
}
