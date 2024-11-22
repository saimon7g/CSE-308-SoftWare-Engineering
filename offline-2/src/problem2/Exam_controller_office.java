package problem2;

import java.util.ArrayList;
import java.util.List;

public class Exam_controller_office {
    private List<Examiner> examiners;
    private List<Student> students;

    public Exam_controller_office() {
    }

    public List<Examiner> getExaminers() {
        return examiners;
    }


    public void setExaminers(List<Examiner> examiners) {
        this.examiners = examiners;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void send(Participant participant, Script_bundle examScripts_with_marksheet) {
        if(participant instanceof Student) {
            System.out.println("(contoller office) reexamination request received from student with id "+participant.getID());

            System.out.println("(contoller office) reexamination request forwarded to examiner with id "+examScripts_with_marksheet.examScripts.get(0).getExaminer_id());
            examiners.get(examScripts_with_marksheet.examScripts.get(0).getExaminer_id()).reexamine(examScripts_with_marksheet.examScripts.get(0));
        }

        if((participant instanceof Examiner) && (examScripts_with_marksheet.marksheet==null)) {
            System.out.println("(contoller office) reexamination complete received from examiner with id "+participant.getID());
            System.out.println("(contoller office) reexamination response forwarded to student with id "+examScripts_with_marksheet.examScripts.get(0).getStudent_id());
            students.get(examScripts_with_marksheet.examScripts.get(0).getStudent_id()).receive(examScripts_with_marksheet);
        }

        if((participant instanceof Examiner) && (examScripts_with_marksheet.marksheet!=null)) {
            System.out.println("(contoller office) exam scripts and marksheets received from examiner with id "+participant.getID());

            for(int i=0; i<examScripts_with_marksheet.examScripts.size(); i++) {
                System.out.println("(contoller office) examinee id-  "+examScripts_with_marksheet.examScripts.get(i).getStudent_id()+": "+examScripts_with_marksheet.marksheet.get(i));
                Script_bundle sb=new Script_bundle();
                List<Script> s=new ArrayList<>();
                s.add(examScripts_with_marksheet.examScripts.get(i));
                sb.examScripts=s;
                students.get(examScripts_with_marksheet.examScripts.get(i).getStudent_id()).receive(sb);
            }
        }
    }
}
