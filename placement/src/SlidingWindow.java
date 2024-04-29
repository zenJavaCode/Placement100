public class SlidingWindow {

    public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6,7,8,9,10};
int k = 3;
printKMax(arr,k,arr.length);


    }

    static  void printKMax(int[] arr, int k,int n) {

        int j ,max;
        for(int i = 0;i <= n-k;i++) {
            max = arr[i];
            for(j =1;j<k;j++){
                int p= i+j;
                if(arr[p]>max) max = arr[p];
            }
            System.out.println(max + " ");


        }

    }
}
