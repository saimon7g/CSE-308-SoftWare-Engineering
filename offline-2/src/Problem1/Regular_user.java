package Problem1;

import java.util.Scanner;

public class Regular_user extends Observer{

    public Regular_user(ServerABC server, String user_name) {
        super(server, user_name);
    }
    @Override
    public void notifyObserver() {
        if(getServer()==null){
            System.out.println("not using any server");
        }


        int previous = getServer().getPreviousState();
        int current = getServer().getCurrentState();

        Scanner input = new Scanner(System.in);
        System.out.println("notified userr "+ getName());

        /* state = 1(operational), 2(partially using ABC), 3(fully using DEF), 4(no service) */
        if(previous==1 && current==2) {
            System.out.println("Server is partially down. choose an option from below. press -");
            System.out.println("1. to continue using limited functionality from current server");
            System.out.println("2. to use full service from remote server with $20/hour payment");
            int temp = input.nextInt();
            input.nextLine();

            if(temp == 1) {
                setState(2);
            } else if(temp == 2) {
                setState(3);
            } else {
                System.out.println("wrong input");
                setState(2);
            }

        } else if(previous==1 && current==3) {
            System.out.println("use service from remote server with $20/hour payment");
            System.out.println("press y for yes");
            System.out.println("press n for no");

            String x=input.nextLine();

            if(x.equalsIgnoreCase("Y")) {
                setState(3);
            } else if(x.equalsIgnoreCase("N")) {
                setState(4);
            } else {
                System.out.println("wrong input");
                setState(4);
            }

        } else if (previous==2 && current==1) {
            if(getState()==3) {
                System.out.println("total bill for using DEF server sent");
            }
            setState(1);
        }
        else if (previous==2 && current==3) {
            System.out.println("Server fully down. sorry for the problem");
            setState(4);
        }
        else if (previous==3 && current==1) {
            if(getState()==3){
            System.out.println(" total bill for using DEF server sent");
            }
            setState(1);
        }
        else if (previous==3 && current==2) {
            System.out.println("Do Nothing");
            setState(2);
        }
    }


}