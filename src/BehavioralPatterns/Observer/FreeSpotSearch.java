package BehavioralPatterns.Observer;

public class FreeSpotSearch {

    public static void main(String[] args) {
        HostitalRegistrationSystem registrationSystem = new HostitalRegistrationSystem();

        registrationSystem.addFreeSpot("Surgeon, 22.01.2023");
        registrationSystem.addFreeSpot("Optometrist, 30.01.2023");

        Observer firstSubscriber = new Subscriber("Lidia Belyaeva");
        Observer secondSubscriber = new Subscriber("Ilze Bode");

        registrationSystem.addObserver(firstSubscriber);
        registrationSystem.addObserver(secondSubscriber);

        registrationSystem.addFreeSpot("Surgeon, 05.02.2023");
        registrationSystem.removeFreeSpot("Surgeon, 22.01.2023");

    }
}
