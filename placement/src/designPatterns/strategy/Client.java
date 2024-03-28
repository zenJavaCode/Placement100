package designPatterns.strategy;

import designPatterns.strategy.sorting.BubbleSort;
import designPatterns.strategy.sorting.InsertionSort;
import designPatterns.strategy.sorting.SelectionSort;
import designPatterns.strategy.sorting.SortingService;

public class Client {

    public static void main(String[] args) {
        PaymentByCard paymentByCard = new PaymentByCard();
        PaymentService paymentService = new PaymentService(paymentByCard);
        paymentService.processOrder();


        PaymentByUPI paymentByUPI = new PaymentByUPI();
        PaymentService paymentService2  = new PaymentService(paymentByUPI);
        paymentService2.processOrder();

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        SelectionSort selectionSort = new SelectionSort();
        SortingService sortingService = new SortingService(selectionSort);
        sortingService.sortArray(arr);

        BubbleSort bubbleSort = new BubbleSort();
        SortingService sortingService2 = new SortingService(bubbleSort);
        sortingService2.sortArray(arr);


        InsertionSort insertionSort = new InsertionSort();
        SortingService sortingService3 = new SortingService(insertionSort);
        sortingService3.sortArray(arr);
    }

}
