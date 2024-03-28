package designPatterns.strategy.sorting;

public class SelectionSort implements  SortingStrategy {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
       for(int i =0;i<n-1;i++){
           int minIndex = i;
           for(int j = i+1;j<n;j++){
               if(arr[j]<arr[minIndex]){
                   minIndex = j;
               }
           }
           if(minIndex != i ){
               int temp = arr[minIndex];
               arr[minIndex]  = arr[i];
               arr[i] = temp;
           }
       }
    }





































    public void selectionSorting(int[] arr) {
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            int min_index = i;
            for(int j =i+1;j<n;j++){
                if(arr[j] < arr[min_index]) j = min_index;
            }
            if(min_index !=i){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
