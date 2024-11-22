package problem2;

public abstract class Participant {
    private Exam_controller_office exam_controller_office;
    private int id;

    public Participant(Exam_controller_office exam_controller_office, int id) {
        this.exam_controller_office = exam_controller_office;
        this.id = id;
    }

    public Exam_controller_office getExamControllerOffice() {
        return exam_controller_office;
    }

    public int getID() {
        return id;
    }

    public abstract void receive(Script_bundle scripts_with_marksheet);
}
