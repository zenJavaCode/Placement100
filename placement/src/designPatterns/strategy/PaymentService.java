package designPatterns.strategy;

public class PaymentService {

    PaymentStrategy paymentStrategy;


    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }


    public  void processOrder(){
        paymentStrategy.processPaymanet();
    }
}
