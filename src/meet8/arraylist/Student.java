package meet8.arraylist;

/**
 *
 * @author ammfat
 */
public class Student {

    private final double MIN_SCORE = 80;

    private String name;
    private double examResult;
    private boolean pass;

    public Student(String name, double examResult) {
        this.setName(name);
        this.setExamResult(examResult);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExamResult() {
        return examResult;
    }

    public void setExamResult(double examResult) {
        if (examResult > 0) {
            this.examResult = examResult;
        } else {
            this.examResult = 0;
        }

        this.setPass(this.examResult);
    }

    public boolean isPass() {
        return pass;
    }

    private void setPass(double examResult) {
        this.pass = examResult > this.MIN_SCORE;
    }
}
