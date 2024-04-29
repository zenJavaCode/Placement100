package sample;

import java.util.concurrent.CompletableFuture;

class A {
    public static void main(String[] args) {
        CompletableFuture<String> pizzaFuture = orderPizza();

        System.out.println("Doing other tasks while waiting for the pizza...");

        pizzaFuture.thenAccept(pizza -> {
            System.out.println("Hooray! Pizza is ready: " + pizza);
            // Now you can enjoy your pizza!
        });

    }

    public static CompletableFuture<String> orderPizza() {
        CompletableFuture<String> pizzaFuture = new CompletableFuture<>();

        // Simulate pizza delivery after some time (5 seconds)
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulate pizza preparation time
                pizzaFuture.complete("Pepperoni Pizza"); // Pizza is ready
            } catch (InterruptedException e) {
                pizzaFuture.completeExceptionally(e); // If something goes wrong
            }
        }).start();

        return pizzaFuture;
    }
}


