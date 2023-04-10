package Mediator;

public class UberBlack implements Cab {
    private boolean available;

    public UberBlack() {
        available = true;
    }

    @Override
    public void receiveRequest(String pickupLocation, String dropoffLocation) {
        System.out.println("[UberBlack] has received a ride request from " + pickupLocation + " to " + dropoffLocation);
        available = false; // Set availability to false after receiving a request
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
