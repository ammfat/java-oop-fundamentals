package meet8.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class StudentApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        final int N_STUDENTS_DEFAULT = 3;
        int nStudents;
        
        try {
            System.out.print("Number of Students\t: ");
            nStudents = scanner.nextInt();
            
            if (nStudents < 0) {
                System.out.println("[!!] Cannot less than 0");
                System.out.println("Set to default...");

                nStudents = N_STUDENTS_DEFAULT;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong when"
                    + " defining number of students.");
            System.out.println(e);

            scanner.next();
            nStudents = N_STUDENTS_DEFAULT;
        }
        
        System.out.println(nStudents);
        
        Student[] students = new Student[nStudents];
        
        for (int i = 0; i < students.length; i++) {
            String name;
            double examResult;
            
            System.out.println("Student " + (i + 1) + "");
            
            System.out.print("Name\t: ");
            name = scanner.next(); // Maul

            try {
                System.out.print("Exam\t: ");
                examResult = scanner.nextDouble();
            } catch (InputMismatchException e1) {
                System.out.println("Something went wrong when inputting data.");
                System.out.println(e1);
                scanner.next();

                name += " <entityFromException>"; // Maul <entityFromException>
                examResult = 0;
            } catch (Exception e2) {
                System.out.println("There's another exception happened!");
                System.out.println(e2);
                
                name += " <entityFromException>"; // Maul <entityFromException>
                examResult = 0;
            } finally {
                System.out.println("It is FINALLY!");
            }
            
            try {
                students[i] = new Student(name, examResult);
            } catch (NullPointerException e) {
                System.out.println("Something went wrong when creating instance.");
                System.out.println(e);
            }
        }
        
        for (Student student : students) {
            var status = student.isPass() ? "Pass" : "NOT Pass";
            
            System.out.print(student.getName());
            System.out.print("\t| ");
            System.out.print(student.getExamResult());
            System.out.print("\t| ");
            System.out.println(status);
            
            System.out.println("-------------------");
        }
    }
}
