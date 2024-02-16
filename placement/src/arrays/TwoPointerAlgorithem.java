package arrays;

public class TwoPointerAlgorithem {

    // when ever you see  array is sorted
    //

    /*TODO: Function to check if triplet is present
    *  arr[]: input array
    *  n: size of the array*/


    public boolean findTripletBruteForce(int arr[],int n){
        for(int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length;j++){
                for(int k = 1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k]) == n ){
                        return true;
                    }
                }

            }
        }
        return false;
    }
    //TODO: here the time complexity is Big(O)n^3;


    //Since the array is sorted

    public boolean isTripletPresent(int[] arr,int n){




        return false;
    }

    public static void main(String[] args) {
int x = 3;
int y =6;
//AND
        System.out.println(x &y);
//OR
        System.out.println(x | x);
    }

}
