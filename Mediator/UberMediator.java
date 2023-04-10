package Mediator;

public interface UberMediator {
    public void addCab(Cab cab);
    public void rideRequest(String pickUpLocation,String dropOffLocation,Cab cab);
}
