package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationServiceOld {

    List<String> customerEmailList;


    public NotificationServiceOld(){
        customerEmailList = new ArrayList<>();
    }

    public void updateCustomer(){
        customerEmailList.forEach(customerEmail -> System.out.println("sent email to customer"));
    }
}
