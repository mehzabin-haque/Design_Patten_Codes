package Facade.Car;

public class FuelInjectImp implements FuelInject {

    @Override
    public void injectFuel() {
        System.out.println("Fuel Injected.....");
    }

    @Override
    public void stopInjectingFuel() {
        System.out.println("Fuel Injection Stopped.....");
    }
    
}
