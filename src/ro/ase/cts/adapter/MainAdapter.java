package ro.ase.cts.adapter;

public class MainAdapter {
    public static void main(String[] args){
        AbstractTrainTicketingSystem trainTicketingSystem = new TrainTicketingSystem();
        trainTicketingSystem.buyTicket(3,6);

        AbstractBusTicketingSystem busTicketingSystem = new BusTicketingSystem();
        busTicketingSystem.reserveSeat();

        trainTicketingSystem = new BusToTrainObjectAdapter(busTicketingSystem);
        trainTicketingSystem.buyTicket(5,20);

        trainTicketingSystem = new BusToTrainClassAdapter();
        trainTicketingSystem.buyTicket(100, 200);
    }
}
