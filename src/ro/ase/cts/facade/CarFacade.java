package ro.ase.cts.facade;

public class CarFacade {
    private Engine engine = new Engine();
    private BrakingSystem brakingSystem = new BrakingSystem();
    private LightingSystem lightingSystem = new LightingSystem();

    public void emergencyBrake(){
        engine.setLoad(0);
        brakingSystem.applyRearBrakes();
        brakingSystem.applyFrontBrakes();
        lightingSystem.turnOnHazardLights();
    }

    public void start(){
        lightingSystem.turnOnLowBeam();
        brakingSystem.resetBrakes();
        engine.setLoad(10);
    }
}
