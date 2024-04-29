package designPatterns.observer;

public class EmailListener implements  Listener{

    String email;

    public EmailListener(String email){
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("sends email to the customer");
    }
}
