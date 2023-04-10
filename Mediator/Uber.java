package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Uber implements UberMediator {
    private List<Cab> cabs = new ArrayList<>();

    @Override
    public void rideRequest(String pickupLocation, String dropoffLocation, Cab colleague) {
        boolean available = false;

        for (Cab cab : cabs) {
            if (cab.isAvailable()) {
                cab.receiveRequest(pickupLocation, dropoffLocation);
                available = true;
                break;
            }
        }

        if (!available) {
            System.out.println("No cabs available at the moment. Please try again later.");
        }
    }

    @Override
    public void addCab(Cab colleague) {
        cabs.add(colleague);
    }
}
