package problem3;

public class No_money implements  states{
    @Override
    public void InsertMoney(int amount) {
        System.out.println("Inserted amount is  " + amount);
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Cannot dispense product because money is not inserted");

    }
}
