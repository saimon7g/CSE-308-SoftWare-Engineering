package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner extends Participant{
    private List<Script> scripts;
    private List<Integer> marksheet;

    public Examiner(Exam_controller_office examControllerOffice, int id) {
        super(examControllerOffice, id);
    }

    public void examin() {
        Random random = new Random();
        marksheet = new ArrayList<>();
        int must_error = random.nextInt(scripts.size());

        for(int i=0; i<scripts.size(); i++) {
            if(i == must_error) {
                marksheet.add(random.nextInt(100)+5);
                scripts.get(i).setUpdated_marks(marksheet.get(i));
                continue;
            }
            int randNum = random.nextInt(100);
            if(randNum%2 == 0) {
                marksheet.add(random.nextInt(100)+5);
                scripts.get(i).setUpdated_marks(marksheet.get(i));
            } else {
                marksheet.add(scripts.get(i).getUpdated_marks());
                scripts.get(i).setUpdated_marks(marksheet.get(i));
            }
        }
        Script_bundle scripts_with_marksheet= new Script_bundle();
        scripts_with_marksheet.examScripts = scripts;
        scripts_with_marksheet.marksheet = marksheet;

        System.out.println("(from examiner view) exam scripts and marksheets sent from examiner with id "+getID());
        getExamControllerOffice().send(this, scripts_with_marksheet);
    }

    public void reexamine(Script script) {
        Random random = new Random();
        int randNum = random.nextInt();

        if (randNum%2==0) {
            System.out.println("no change in number");
        } else if (randNum%3==0) {
            script.setPrevious_marks(script.getUpdated_marks());
            script.setUpdated_marks(script.getPrevious_marks() + 5);
        } else if (randNum%5==0) {
            script.setPrevious_marks(script.getUpdated_marks());
            script.setUpdated_marks(script.getPrevious_marks() - 5);
        }
        Script_bundle bundle_with_mark= new Script_bundle();
        List<Script> sc=new ArrayList<>();
        sc.add(script);
        bundle_with_mark.examScripts=sc;

        System.out.println("(from examiner view) reexamination done by examiner " + getID());
        getExamControllerOffice().send(this, bundle_with_mark);
    }
    @Override
    public void receive(Script_bundle scripts_with_marksheet) {
        System.out.println("(from examiner view) exam script received by examiner with id "+getID());
        scripts = scripts_with_marksheet.examScripts;
        marksheet=scripts_with_marksheet.marksheet;
        examin();
    }
}