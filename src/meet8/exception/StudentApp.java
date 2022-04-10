package meet8.exception;

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

        System.out.print("Number of Students\t: ");
        nStudents = scanner.nextInt();

        if (nStudents < 0) {
            System.out.println("[!!] Cannot less than 0");
            System.out.println("Set to default...");

            nStudents = N_STUDENTS_DEFAULT;
        }
        
        Student[] students = new Student[nStudents];
        
        for (int i = 0; i < students.length; i++) {
            String name;
            double examResult;
            
            System.out.println("Student " + (i + 1) + "");
           
            System.out.print("Name\t: ");
            name = scanner.next();

            System.out.print("Exam\t: ");
            examResult = scanner.nextDouble();

            students[i] = new Student(name, examResult);
        }
        
        for (Student student : students) {
            var status = student.isPass() ? "Pass" : "NOT Pass";
            
            System.out.print(student.getName());
            System.out.print("\t| ");
            System.out.print(student.getExamResult());
            System.out.print("\t| ");
            System.out.print(status);
            
            System.out.println("-------------------");
        }
    }
}
