import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input Company Name");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Company com=Factory.getCompany(input);
        if(com!=null){
            Plane myplane=com.getPlane();
            myplane.print();
        }
    }
}