package ro.ase.cts.state;

public class DelieveringProductState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please pick your product");
    }
}
