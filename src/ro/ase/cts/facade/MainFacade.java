package ro.ase.cts.facade;

public class MainFacade {
    public static void main(String[] args){
        CarFacade carFacade = new CarFacade();
        carFacade.start();
        carFacade.emergencyBrake();
    }
}
