import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String region="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your continental Location \n Asia \n Europe \n USA");
        region=sc.nextLine();
        Factory factory=new Factory();
        Company company= factory.getCompany(region);
        Car myCar=null;
        if(company!=null){
            myCar=company.getCar();
            System.out.println("Availabe Car for your region ");
            printCarDetails( myCar);

        }
    }
    private static void printCarDetails(Car myCar) {
        System.out.println("Color : " + myCar.getColor());
        System.out.println("Engine Type : " + myCar.getEngine());
        System.out.println("Drive Train : " + myCar.getDriveTrain());
        System.out.println("Manufactourer Company : " + myCar.getManufacturingCompany());
        System.out.println("Manufactourer Country : " + myCar.getManufacturingCountry());

    }


}