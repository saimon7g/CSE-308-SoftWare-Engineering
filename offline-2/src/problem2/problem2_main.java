package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem2_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam_controller_office examControllerOffice = new Exam_controller_office();

        List<Examiner> examiners = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        for(int i=0; i<2; i++) {
            examiners.add(new Examiner(examControllerOffice, i));
        }
        examControllerOffice.setExaminers(examiners);
        for(int i=0; i<5; i++) {
            students.add(new Student(examControllerOffice, i));
        }
        examControllerOffice.setStudents(students);

        List<Script_bundle> array_of_bundle = new ArrayList<>();
        for(int i=0; i<examiners.size(); i++){
            List<Script> s=new ArrayList<>();
            List<Integer> m= new ArrayList<>();
            Script_bundle sb=new Script_bundle();
            sb.examScripts=s;
            sb.marksheet=m;
            array_of_bundle.add(sb);
        }


        for(int i=0, examinerCount=0; i<students.size(); i++) {
            if(examinerCount >= examiners.size()) {
                examinerCount = 0;
            }
            Script temp=new Script(examinerCount, i);
            array_of_bundle.get(examinerCount).examScripts.add(temp);
            examinerCount++;
        }




        for(int i=0; i<examiners.size(); i++) {
            examiners.get(i).receive(array_of_bundle.get(i));
        }

        while(true) {
            System.out.print("enter examinee id for reexamination \n negative num  to quit ");
            int id = scanner.nextInt();
            System.out.println(" hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh          "+ id);

            if (id <0) {
                break;
            } else {
                students.get(id).requestReexamination();
            }
        }
    }
}
