package meet8.arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

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

        try {
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

            nStudents = N_STUDENTS_DEFAULT;
        }

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < nStudents; i++) {
            String name;
            double examResult;

            System.out.println("Student " + (i + 1) + "");

            System.out.print("Name\t: ");
            name = scanner.next();

            try {
                System.out.print("Exam\t: ");
                examResult = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong when inputting data.");
                System.out.println(e);
                scanner.next();

                name += " <entityFromException>";
                examResult = 0;
            }
            
            students.add(new Student(name, examResult));
        }

        for (Student student : students) {
            var status = student.isPass() ? "Pass" : "NOT Pass";

            System.out.print(student.getName());
            System.out.print("\t| ");
            System.out.print(student.getExamResult());
            System.out.print("\t| ");
            System.out.println(status);

            System.out.println("-----------------------------");
        }
   }
}
