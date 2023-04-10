package Mediator;

public class Main {
    public static void main(String[] args) {
        UberMediator uber = new Uber();

        Cab cab1 = new UberCab(uber, "UberX");
        Cab cab2 = new UberCab(uber, "UberBlackX");
        Cab cab3 = new UberCab(uber, "UberPool");
        
        uber.addCab(cab1);
        uber.addCab(cab2);
        uber.addCab(cab3);

        uber.rideRequest("Nilkhet", "Mirpur 10", cab1);
        uber.rideRequest("Dhanmondi", "Mirpur 12", cab2);
        uber.rideRequest("Curzon", "Gulshan", cab2);
    }
}
