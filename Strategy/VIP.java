package Strategy;

public class VIP implements DiscountStrategy{

    @Override
    public double discount(double amount) {
        return amount*0.3;
    }
    
}
