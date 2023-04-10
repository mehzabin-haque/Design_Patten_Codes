package AbstractFactory;

public class HPCompany extends Company{

    @Override
    public GPU createGPU() {
        GPU hp = new HPGPU();
        hp.assemble();
        return hp;
    }

    @Override
    public Monitor createMonitor() {
        Monitor hp = new HPMonitor();
        hp.work();
        return hp;
    }
}