package Template;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Brewing coffee.....");
    }

    @Override
    protected void addSomething() {
        System.out.println("Adding milk and sugar into coffee.......");
    }
    
}
