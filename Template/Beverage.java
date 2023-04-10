package Template;

public abstract class Beverage {
    
    public final void prepareBeverage(){
        boilWater();
        brew();
        pourIntoCup();
        addSomething();
    }

    private void boilWater(){
        System.out.println("Boiling Water........");
    }

    private void pourIntoCup(){
        System.out.println("Poured into cup........");
    }

    protected abstract void brew();
    protected abstract void addSomething();

}
