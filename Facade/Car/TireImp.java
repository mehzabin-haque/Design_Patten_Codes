package Facade.Car;

public class TireImp implements Tire {

    @Override
    public void tireRotate() {
        System.out.println("Tire is rotating to go forward.....");
    }

    @Override
    public void tireStop() {
        System.out.println("Tire got stopped.....");
    }
    
}
