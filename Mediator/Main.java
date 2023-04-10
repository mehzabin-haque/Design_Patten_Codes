package Mediator;

public class Main {
    public static void main(String[] args) {
        UberMediator uberApp = new Uber();

        Cab uberX = new UberX();
        Cab uberBlack = new UberBlack();
        
        uberApp.addCab(uberX);
        uberApp.addCab(uberBlack);

        // Request rides
        uberApp.rideRequest("Times Square", "Central Park", uberX);
        uberApp.rideRequest("Empire State Building", "Statue of Liberty", uberBlack);
        uberApp.rideRequest("Brooklyn Bridge", "Central Park", uberX);
    }
}
