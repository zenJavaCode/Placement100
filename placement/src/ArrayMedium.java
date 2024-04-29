import java.util.ArrayList;

public class ArrayMedium {

    public static void main(String[] args) {
int[] v = {2 ,2 ,1 ,3 ,1 ,1 ,3 ,1 ,1};
majorityElement(v);
    }

    public static int majorityElement(int []v) {
        // Write your code here
        int majority = v.length/2;
        int count =0;
        int result = 0;
        for(int i =0;i<v.length;i++){
            result = v[i];
            for(int j =0;j<v.length;j++){
                if(v[i] == v[j]){
                    count++;
                }
            }
            if(count>= majority){
                return result;
            }
            count =0;
        }
        return result;
    }


    public void sortOs1s2s(int[] arr){
        int low =0,mid =0,high = arr.length-1;
        while(mid<high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }





}
