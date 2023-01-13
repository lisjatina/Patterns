package BehavioralPatterns.Observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> freeSpots) {
        System.out.println("Dear " +name + " we have free spots to doctors visit " + freeSpots);
    }
}
