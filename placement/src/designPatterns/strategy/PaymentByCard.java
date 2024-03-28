package designPatterns.strategy;

public class PaymentByCard implements  PaymentStrategy{
    @Override
    public void processPaymanet() {
        System.out.println("Paying by card using strategy design pattern");
    }
}
