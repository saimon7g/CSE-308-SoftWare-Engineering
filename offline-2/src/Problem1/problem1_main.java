package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class problem1_main {
    private static void Print_server_state(int prev) {
        if(prev == 1) {
            System.out.println("Previous state : operational");
        } else if(prev == 2) {
            System.out.println("Previous state : partially down");
        } else if(prev == 3) {
            System.out.println("Previous state : fully down");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Observer> users = new ArrayList<>();
        ServerABC server = new ServerABC();
        int temp;
        while(true){
            Print_server_state(server.getCurrentState());
            System.out.println("Choose options from below");
            System.out.println("1. change server state");
            System.out.println("2. add user");
            System.out.println("3. exit");

            temp=input.nextInt();
            input.nextLine();
            if(temp==1){
                System.out.println("Choose options from below");
                System.out.println("1. operational");
                System.out.println("2. partially down");
                System.out.println("3. fully down");

                temp=input.nextInt();
                input.nextLine();
                if(temp==1 || temp==2 ||temp==3) {
                    server.setCurrentState(temp);
                } else {
                    System.out.println("Wrong Input");
                }
            } else if (temp == 2) {
                if (server.getCurrentState() != 1) {
                    System.out.println("server down");
                    continue;
                }

                System.out.println("Add user--");
                System.out.println("1.Premium");
                System.out.println("2.Regular");

                temp = input.nextInt();
                input.nextLine();

                if (temp == 1) {
                    System.out.print("Enter Username");
                    String name = input.nextLine();
                    new Premium_user(server, name);
                } else if (temp==2) {
                    System.out.print("Enter Username");
                    String name = input.nextLine();
                    new Regular_user(server, name);
                }else{
                    System.out.println("Wrong input");
                }

            } else if (temp == 3) {
                break;
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}