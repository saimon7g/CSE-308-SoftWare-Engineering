package problem3;

import java.util.Scanner;

public class problem3_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vending_machine v = new Vending_machine();
        while (true) {
            System.out.println("press Q to quit");
            System.out.println("press 1 to insert money");
            System.out.println("press 2 to collect product");
            String s = input.nextLine();
            if (s.equalsIgnoreCase("Q")) {
                break;
            } else if (s.equalsIgnoreCase("1")) {
                System.out.println("insert Amount");
                int x = input.nextInt();
                input.nextLine();
                v.InsertMoney(x);
            } else if (s.equalsIgnoreCase("2")) {
                v.dispenseProduct();
            } else {
                System.out.println("wrong input");
            }


        }

    }


}
