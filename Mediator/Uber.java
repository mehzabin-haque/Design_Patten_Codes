package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Uber implements UberMediator {

    private List<Cab> cabList = new ArrayList<>();
    @Override
    public void addCab(Cab cab) {
       cabList.add(cab);
    }
    @Override
    public void rideRequest(String pickUpLocation, String dropOffLocation, Cab cab) {
       boolean avail = false;

       for(Cab cabs:cabList){
        if(cabs.isAvail){
            cabs.recieveRequest(pickUpLocation, dropOffLocation);
            avail = true;
            break;
        }
       }

       if(!avail){
        System.out.println("No Cabs avaiable at the moment\nTry again later......");
       }
    }

    
}
