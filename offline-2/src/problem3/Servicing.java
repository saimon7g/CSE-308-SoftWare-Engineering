package problem3;

public class Servicing implements  states{
    @Override
    public void InsertMoney(int amount) {
        System.out.println("Vending machine is busy ");

    }

    @Override
    public void dispenseProduct() {
        System.out.println("Vending Machine  dispensed the product");


    }
}
