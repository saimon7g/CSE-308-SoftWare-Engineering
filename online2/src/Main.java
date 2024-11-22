import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Car c1=new Car("premium");
        Car c2=new Car("regular");
        Car c3=new Car("premium");
        Car c4=new Car("regular");
        Car c5=new Car("premium");
        Car c6=new Car("regular");
        while (true){
            System.out.println("choose a car:" +
                    "Premium:" +
                    "c1,c3,c5");
            System.out.println("regular: c2,c4,c6");
            System.out.println("inter Q to exit");
            String x=input.nextLine();
            if(x.equalsIgnoreCase("Q")){
                break;
            } else if (x.equalsIgnoreCase("c1")) {
                System.out.println("input num of days you wwant");
                int y=input.nextInt();
                System.out.println("your rent is"+c1.getPricing(y));
            }
            else if (x.equalsIgnoreCase("c2")) {
                System.out.println("input num of days you wwant");
                int y = input.nextInt();
                System.out.println("your rent is" + c2.getPricing(y));
            }
            else{
                System.out.println("wrong input");
            }
            input.nextLine();
        }



    }
}