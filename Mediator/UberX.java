package Mediator;

public class UberX implements Cab {
    private boolean available;

    public UberX() {
        available = true;
    }

    @Override
    public void receiveRequest(String pickupLocation, String dropoffLocation) {
        System.out.println("[UberX] has received a ride request from " + pickupLocation + " to " + dropoffLocation);
        available = false; // Set availability to false after receiving a request
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
