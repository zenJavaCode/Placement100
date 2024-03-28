package designPatterns.strategy;

public class PaymentByUPI implements PaymentStrategy{
    @Override
    public void processPaymanet() {
        System.out.println("Paying by UPI using strategy pattern.");
    }
}
