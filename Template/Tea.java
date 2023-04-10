package Template;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Brewing tea.......");
    }

    @Override
    protected void addSomething() {
        System.out.println("Adding lemon and sugar into tea........");
    }
    
}