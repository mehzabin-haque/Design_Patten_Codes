package Decorator;

public class PizzaDeco implements Pizza{

    protected Pizza pizzaDeco;

    public PizzaDeco(Pizza pizzaDeco){
        this.pizzaDeco = pizzaDeco;
    }

    @Override
    public double getcost() {
      return  pizzaDeco.getcost();    }
    
}
