package meet7;

/**
 *
 * @author ammfat
 */
public class Students {

    public Students(int nStudent) {
        this.setnStudent(nStudent);
        this.names = new String[this.getnStudent()];
        this.examResults = new double[this.getnStudent()];
        this.status = new boolean[this.getnStudent()];
    }
    
    private final double MINIMUM_SCORE = 80;
    private int nStudent;
    private String[] names;
    private double[] examResults;
    private boolean[] status;

    public final int getnStudent() {
        return nStudent;
    }

    private void setnStudent(int nStudent) {
        if (nStudent >= 0) {
            this.nStudent = nStudent;
        } else {
            this.nStudent = 0;
        }
    }

    public String[] getNames() {
        return names;
    }
    
    public String getNames(int index) {
        if (index >= 0 && index < this.getnStudent()) {
            return this.names[index];
        } else {
            return "[!!] No Data";
        }
    }

    public void setNames(String[] names) {
        this.names = names;
    }
    
    // Overload
    public void setNames(String name, int index) {
        this.names[index] = name;
    }

    public double[] getExamResults() {
        return examResults;
    }
    
    public double getExamResults(int index) {
        if (index >= 0 && index < this.getnStudent()) {
            return this.examResults[index];
        } else {
            return -1;
        }
    }

    public void setExamResults(double[] examResults) {
        this.examResults = examResults;
    }
    
    // Overload
    public void setExamResults(double examResult, int index) {
        this.examResults[index] = examResult;
        this.calcStatus(examResult, index);
    }

    public boolean[] getStatus() {
        return status;
    }
    
    public boolean getStatus(int index) {
        if (index >= 0 && index < this.getnStudent()) {
            return this.status[index];
        } else {
            return false;
        }
    }
    
    private void calcStatus(double examResults, int index) {
        this.status[index] = examResults > this.MINIMUM_SCORE;
    }
}
