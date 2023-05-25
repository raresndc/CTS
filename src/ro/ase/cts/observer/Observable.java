package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void unsuscribe(Observer observer){
        observers.remove(observer);
    }

    public void sendNotification(String message){
        for(Observer observer : observers){
            observer.receiveNotification(message);
        }
    }
}
