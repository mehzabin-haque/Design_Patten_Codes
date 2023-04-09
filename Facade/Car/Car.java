package Facade.Car;

public class Car {
    private Engine engine;
    private FuelInject fuelInject;
    private Tire tire;

    public Car(){
        engine = new EngineImp();
        fuelInject = new FuelInjectImp();
        tire = new TireImp();
    }

    public void start(){
        engine.start();
        fuelInject.injectFuel();
        tire.tireRotate();
    }

    public void stop(){
        engine.stop();
        fuelInject.stopInjectingFuel();
        tire.tireStop();
    }
}
