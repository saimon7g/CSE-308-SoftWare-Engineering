package problem3;

public class Out_of_service implements states{
    @Override
    public void InsertMoney(int amount) {
        System.out.println("Cannot dispense product because machine has no product");

    }

    @Override
    public void dispenseProduct() {
        System.out.println("Cannot dispense product because machine has no product");
    }
}
