package meet7;

import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class StudentsMoreApp {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var students = new Students(3);
        
        scanner.useDelimiter("\n");
        
        String name, status;
        double examResult;
        
        for (int i = 0; i < students.getnStudent(); i++) {
            System.out.println("Student " + (i + 1) + "");
            System.out.print("Name\t: ");
            name = scanner.next();

            System.out.print("Exam\t: ");
            examResult = scanner.nextDouble();
         
            students.setNames(name, i);
            students.setExamResults(examResult, i);
        }

        for (int i = 0; i < students.getnStudent(); i++) {
            status = students.getStatus(i) ? "PASS" : "NOT Pass";
           
            System.out.print(students.getNames(i));
            System.out.print("\t| ");
            System.out.print(students.getExamResults(i));
            System.out.print("\t| ");
            System.out.println(status);
        }        
    }
}