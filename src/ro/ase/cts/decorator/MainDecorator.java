package ro.ase.cts.decorator;

public class MainDecorator {
    public static void main(String[] args){
        Vehicle car = new Car();
        car.stop();
        car.start();

        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeats = new CarWithSportSeats(car);
        carWithSportSeats.setSeatProducer("Recaro");
    }
}
