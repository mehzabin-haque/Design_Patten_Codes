package Mediator;

public abstract class Cab {
    protected UberMediator mediator;
    protected String name;
    protected boolean isAvail;

    public Cab(UberMediator mediator, String name){
        this.isAvail = true;
        this.mediator=mediator;
        this.name=name;
    }

    public boolean isAvailable(){
        return isAvail;
    }

    public void setAvailable(boolean available){
        this.isAvail = available;
    }

    public abstract void recieveRequest(String pickupLocation, String dropOffLocation);
}
