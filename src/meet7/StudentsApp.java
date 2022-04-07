package meet7;
import java.util.Scanner;

/**
 *
 * @author ammfat
 */
public class StudentsApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        var students = new Students(3);
        
        String[] names = new String[students.getnStudent()];
        double[] examResults = new double[students.getnStudent()];
        
        for (int i = 0; i < students.getnStudent(); i++) {
            System.out.println("Student " + (i+1) + "");
            System.out.print("Name\t: ");
            names[i] = scanner.next();
            
            System.out.print("Exam\t: ");
            examResults[i] = scanner.nextDouble();
        }
        
        students.setNames(names);
        students.setExamResults(examResults);
        
        for (String studentName : students.getNames()) {
            System.out.println(studentName);
        }
        
        for (int i = 0; i < students.getnStudent(); i++) {
            System.out.print(students.getNames()[i]);
            System.out.print("\t| ");
            System.out.println(
                    students.getExamResults()[i]
            );
        }
    }
}
