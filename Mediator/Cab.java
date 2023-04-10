package Mediator;

public interface Cab {
    void receiveRequest(String pickupLocation, String dropoffLocation);
    boolean isAvailable();
}