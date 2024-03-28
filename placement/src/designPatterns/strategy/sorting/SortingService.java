package designPatterns.strategy.sorting;

public class SortingService {

    SortingStrategy sortingStrategy;

    public SortingService(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }


    public void sortArray(int[] arr){
         sortingStrategy.sort(arr);
    }
}
