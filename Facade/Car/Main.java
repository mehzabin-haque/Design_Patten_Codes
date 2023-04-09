package Facade.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car start..........Vurummmm........Vurummmm......");
        car.start();
        System.out.println("---------------------");
        System.out.println("Pressed the Break");
        System.out.println("---------------------");
        car.stop();
        System.out.println("Car Stopped............Sad.........Sad..........");
    }
}
