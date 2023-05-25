package ro.ase.cts.chain;

public class MainChain {
    public static void main(String[] args){
        CallCenterOperator operator = new CallCenterOperator();
        CallCenterManager manager = new CallCenterManager();
        ChiefFinancialOfficer cfo = new ChiefFinancialOfficer();

        operator.setNextHandler(manager);
        manager.setNextHandler(cfo);
        operator.refund(700);
        operator.refund(2000);
        operator.refund(6000);
    }
}
