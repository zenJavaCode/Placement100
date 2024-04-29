package designPatterns.observer;

import java.util.List;

public class NotificationService {

    List<Listener> customers;


    public NotificationService(List<Listener> customers){
        this.customers = customers;
    }


    public void subscribe(Listener listener){
            customers.add(listener);
    }


    public void unsubsribe(Listener listener){
        customers.remove(listener);
    }


}
