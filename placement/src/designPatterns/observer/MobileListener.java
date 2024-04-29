package designPatterns.observer;

public class MobileListener implements Listener{
    String phone;


    public MobileListener(String phone){
        this.phone = phone;
    }

    @Override
    public void update() {
        System.out.println("Sending a mobile notification to the customer.");
    }
}
