package designPatterns.strategy.sorting;

public class BubbleSort implements  SortingStrategy{
    @Override
    public void sort(int[] arr) {

        int[] arrs = {4,3,7,1,5};
        int n = arrs.length;
        for(int i =0;i<n-1;i++){
            for(int j = 0 ;j<(n-i-1);j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
