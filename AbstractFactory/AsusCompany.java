package AbstractFactory;

public class AsusCompany extends Company{

    @Override
    public GPU createGPU() {
        GPU asus = new AsusGPU();
        asus.assemble();
        return asus;
    }

    @Override
    public Monitor createMonitor() {
        Monitor asus = new AsusMonitor();
        asus.work();
        return asus;
    }
}