package Decorator;

public class ToppingPizzaDeco extends PizzaDeco {

    public ToppingPizzaDeco(Pizza pizzaDeco) {
        super(pizzaDeco);
         }

    @Override
    public double getcost(){
        return 5.00+pizzaDeco.getcost();
    }


    
}
