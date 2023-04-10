package Strategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy=discountStrategy;
    }

    public double calculateTotal(double amount) {
        if (discountStrategy == null) {
            throw new IllegalStateException("Discount strategy is not set.");
        }
        
        double discount = discountStrategy.discount(amount);
        return amount - discount;
    }
}
