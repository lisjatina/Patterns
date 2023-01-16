package behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class HostitalRegistrationSystem implements Observed {

    List <String> freeSpots = new ArrayList<>();

    List <Observer> subscribers = new ArrayList<>();

    public void addFreeSpot (String spot){
        this.freeSpots.add(spot);
        notifyObservers();
    }

    public void removeFreeSpot (String spot){
        this.freeSpots.remove(spot);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
       this.subscribers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
    this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
    subscribers.forEach(observer -> observer.handleEvent(this.freeSpots));
    }
}
