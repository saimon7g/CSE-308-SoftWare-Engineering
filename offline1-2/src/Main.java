import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ordercount=0;
        while(true) {
            System.out.println("Enter \n\t'O' to place an order \n\t'E' to exit");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("O")) {
                ordercount++;
                CustomerServiceAgent agent=new CustomerServiceAgent();
                PC myPC=null;
                while(true) {
                    System.out.println("What type of PC do you want : \n1.Gaming \n2.Regular");
                    input = sc.nextLine();
                    if (input.equalsIgnoreCase("E")) {
                        if (myPC == null)
                            System.out.println("You Have to complete the order");
                        else
                            break;
                    } else if (input.equalsIgnoreCase("Regular")) {
                        agent.PCType(input);
                        while(myPC==null) {

                            System.out.println("What type of processor do you want : \n1.i5 20,000BDT \n2.i7 37,000BDT \n2.i9 65,000BDT");
                            input = sc.nextLine();
                            myPC = agent.build(input);
                        }
                        while (true) {
                            System.out.println("Choose what extra component do you want to add \n1.8 GB DDR4 RAM 2666 MHz 2620 BDT" +
                                    "\n2. 8 GB DDR4 RAM 3200 MHz 2950 BDT BDT" +
                                    "\n3. 2GB graphics card 6500 BDT" +
                                    "\n4. 4GB graphics card 7600 BDT" +
                                    "\n Enter Q to quit");
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("8 GB DDR4 RAM 2666 MHz")) {
                                agent.addRAM(input, 2620);
                            } else if (input.equalsIgnoreCase("8 GB DDR4 RAM 3200 MHz")) {
                                agent.addRAM(input, 2950);
                            } else if (input.equalsIgnoreCase("2GB graphics card")) {
                                agent.addGPU(input, 6500);
                            } else if (input.equalsIgnoreCase("4GB graphics card")) {
                                agent.addGPU(input, 7600);
                            } else if (input.equalsIgnoreCase("Q")) {
                                break;
                            }
                        }
                        myPC.print();
                        myPC=null;
                        break;
                    }
                    else if (input.equalsIgnoreCase("Gaming")) {
                        agent.PCType(input);
                        while(myPC==null) {
                            System.out.println("What type of processor do you want : \n1.AMD Ryzen 7 5700X 28,000BDT");
                            input = sc.nextLine();
                            myPC = agent.build(input);
                        }

                        while (true) {
                            System.out.println("Choose what extra component do you want to add \n1.8 GB DDR4 RAM 2666 MHz 2620 BDT" +
                                    "\n2. 8 GB DDR4 RAM 3200 MHz 2950 BDT BDT" +
                                    "\n3. 2GB graphics card 6500 BDT" +
                                    "\n4. 4GB graphics card 7600 BDT" +
                                    "\n Enter Q to quit");
                            input = sc.nextLine();
                            if (input.equalsIgnoreCase("8 GB DDR4 RAM 2666 MHz")) {
                                agent.addRAM(input, 2620);
                            } else if (input.equalsIgnoreCase("8 GB DDR4 RAM 3200 MHz")) {
                                agent.addRAM(input, 2950);
                            } else if (input.equalsIgnoreCase("2GB graphics card")) {
                                agent.addGPU(input, 6500);
                            } else if (input.equalsIgnoreCase("4GB graphics card")) {
                                agent.addGPU(input, 7600);
                            } else if (input.equalsIgnoreCase("Q")) {
                                break;
                            }
                        }

                        myPC.print();
                        myPC=null;
                        break;

                    } else
                        System.out.println("type gaming or Regular");
                }


            }
            else if (input.equalsIgnoreCase("E")) {
                if(ordercount<1)
                    System.out.println("You Have to Order minimum once");
                else
                    break;


            } else
                System.out.println("Invalid Command");
        }
    }
}