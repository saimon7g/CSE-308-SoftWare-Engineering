package problem3;

public class Vending_machine implements states {
    private states vendingMachineState;
    private int num_of_products = 5;
    private int price_of_products = 50;
    private int current_balance = 0;

    public Vending_machine() {
        vendingMachineState = new No_money();
    }

    private states getVendingMachineState() {
        return vendingMachineState;
    }

    private void setVendingMachineState(states vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    @Override
    public void InsertMoney(int amount) {
        vendingMachineState.InsertMoney(amount);
        if (vendingMachineState instanceof No_money) {
            current_balance += amount;
            if (current_balance < price_of_products) {
                System.out.println("insert " + (price_of_products - current_balance) + " tk more");
            } else if (current_balance > price_of_products) {
                int xD = current_balance - price_of_products;
                System.out.println("returned " + xD + " tk");

                states servicing = new Servicing();
                setVendingMachineState(servicing);
                System.out.println("VendingMachine internal state has been moved to : "
                        + vendingMachineState.getClass().getName());
            } else if (current_balance == price_of_products) {
                System.out.println("exact_amount_inserted");
                states servicing = new Servicing();
                setVendingMachineState(servicing);
                System.out.println("VendingMachine internal state has been moved to : "
                        + vendingMachineState.getClass().getName());

            } else {
                System.out.println("Do nothing");
            }

        }


    }

    @Override
    public void dispenseProduct() {
        states noMoenyState = new No_money();
        vendingMachineState.dispenseProduct();
        if (num_of_products < 1) {
            states out_of_serviece = new Out_of_service();
            setVendingMachineState(out_of_serviece);
        }
        if (vendingMachineState instanceof Servicing) {
            num_of_products--;
            current_balance = 0;
            setVendingMachineState(noMoenyState);
            System.out.println("VendingMachine internal state has been moved to : "
                    + vendingMachineState.getClass().getName());
        }

    }
}
