package problem2;

public class Script {
    private int examiner_id;
    private int student_id;
    private int previous_marks;
    private int updated_marks;

    public Script(int examiner_id, int student_id) {
        this.examiner_id = examiner_id;
        this.student_id = student_id;
    }

    public int getExaminer_id() {
        return examiner_id;
    }

    public void setExaminer_id(int examiner_id) {
        this.examiner_id = examiner_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getPrevious_marks() {
        return previous_marks;
    }

    public void setPrevious_marks(int previous_marks) {
        this.previous_marks = previous_marks;
    }

    public int getUpdated_marks() {
        return updated_marks;
    }

    public void setUpdated_marks(int updated_marks) {
        this.updated_marks = updated_marks;
    }
}
