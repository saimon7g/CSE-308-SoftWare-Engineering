package Problem1;

import java.util.Scanner;

public class Premium_user extends Observer{
    public Premium_user(ServerABC server, String user_name) {
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

        /* state = 1( fully using ABC), 2(partially using ABC and DEF), 3(fully using DEF)*/
        if(previous==1 && current==2) {
            System.out.println("Our server is partially down. choose option from below . press - ");
            System.out.println("1. to use service from two servers(ABC, DEF)");
            System.out.println("2. to use service from one server(DEF)");

            int temp=input.nextInt();

            if(temp == 1) {
                setState(2);
            } else if(temp == 2) {
                setState(3);
            } else {
                System.out.println("wrong input");
                setState(2);
            }
        }
        else if(previous==1 && current==3) {
            System.out.println("use service from one server(DEF)");
            setState(3);
        } else if (previous==2 && current==1) {

            //do  nothing
            setState(1);

        }
        else if (previous==2 && current==3) {
            if(getState()==2){
                System.out.println("Server fully down. use service from one server(DEF)");
                setState(3);
            }

        }
        else if (previous==3 && current==1) {
            //do  nothing
            setState(1);


        }
        else if (previous==3 && current==2) {
            //do  nothing
        }

    }
}