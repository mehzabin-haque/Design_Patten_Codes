package Strategy;

public class Premium implements DiscountStrategy{

    @Override
    public double discount(double amount) {
        return amount*0.2;
    }
    
}
