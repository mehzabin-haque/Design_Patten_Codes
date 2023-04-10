package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Company hp = new HPCompany();
        Company asus = new AsusCompany();
        hp.createGPU();
        asus.createMonitor();
        hp.createMonitor();
        asus.createGPU();

    }
}
