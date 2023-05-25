package ro.ase.cts.state;

public class MainState {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.inputMoney(15);
        vendingMachine.selectProduct(10);
    }
}
