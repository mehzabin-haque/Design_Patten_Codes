package Mediator;

public class UberCab extends Cab{

    
    public UberCab(UberMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void recieveRequest(String pickupLocation, String dropOffLocation) {
       System.out.println(name+" has received a ride request from "+ pickupLocation + " to "+dropOffLocation);
       setAvailable(false);
    }
    
}
