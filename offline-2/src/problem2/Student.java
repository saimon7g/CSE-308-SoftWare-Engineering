package problem2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Participant{
    private Script examScript;

    public Student(Exam_controller_office exam_controller_office, int id) {
        super(exam_controller_office, id);
    }

    public void requestReexamination() {
        if(examScript == null) {
            return ;
        }
        Script_bundle script_with_marksheet = new Script_bundle();
        List<Script> examScripts = new ArrayList<>();

        examScripts.add(examScript);
        script_with_marksheet.examScripts = examScripts;
        script_with_marksheet.marksheet=null;
        System.out.println("(from student view) reexamination request sent from examinee with id "+getID());
        getExamControllerOffice().send(this, script_with_marksheet);

    }
    @Override
    public void receive(Script_bundle script_with_marksheet) {
        System.out.println("(from student view)Exam script received by examinee with id "+getID());
        examScript = script_with_marksheet.examScripts.get(0);
        System.out.println("(from student view) marks obatined "+ examScript.getUpdated_marks());
    }
}
