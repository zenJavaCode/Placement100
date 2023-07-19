package arrays;


public class ArrayProblems {

        public static void main(String[] args) {
                int[] numbers= new int[5];
                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                numbers[3] = 4;
                numbers[4] = 5;

        }

        public int removeElement(int[] array,int element){
                int i;
                for(i=0;i<array.length;i++){
                        if(array[i]==element){
                                break;
                        }
                }
                if(i==array.length){
                        return -1;
                }
                for(int j=i;j<array.length-1;j++){
                        array[j]=array[j+1];
                }
                return array.length-1;
        }

        /*Largest Element in  an Array.*/

        public int largestElement(int[] array){

                int max = Integer.MIN_VALUE;
                int i ;
                for( i=0;i<array.length;i++){

                        if(array[i]>max){
                                max=array[i];
                        }
                }
                return max;
        }
        /*Largest element index in an array in single loop or Big O(n).*/

        public static int largestElementIndex(int[] array){
        int result =0;
        for(int i=1;i<array.length;i++){
                if(array[i]>array[result]){
                        result=i;
                }
        }
        return result;
        }


        /*Second largest in Big O(n)*/

        public static int secondLargestElement(int[] array){
                int result=Integer.MIN_VALUE;
                int largestElementIndex = 0;
                for(int i=1;i<array.length;i++){
                        // first condition is whether the ith element is greater than the largest element
                        if(array[i] > array[largestElementIndex]){
                                result=largestElementIndex;
                                largestElementIndex=i;
                        }
                        else if(array[i] != array[largestElementIndex]){
                                if(result ==-1 || array[i] >array[result]){
                                        result=i;
                                }
                        }
                }
                 return result;
        }

        /*Check if array is sorted or not and only check in non-decreasing order and equal are allowed.*/

        public boolean isSorted(int[] array){
                int count=0;
                for(int i=1;i<=array.length;i++){
                        if(array[i]<array[i-1]){
                                return false;
                        }
                }
                return true;
        }
        /*Reverse an Array, array.length gives size of the array*/
        // also k/as two pointer technique.

        public int[] reverseArray(int[] array){

               int low = 0;
               int high = array.length-1;
               while(low<high){
                       int temp = array[low];
                       array[low]=array[high];
                       array[high]=temp;
                       low++;
                       high--;
               }
                return array;
        }

        /*Remove duplicates from the sorted array*/
        //TODO: Revise it again and try to understand the problem better.

        public int[] removeDuplicatesFromSortedArray(int[] array){

                int[] temp= new int[array.length];
                temp[0]=array[0];
                int result=1;
                for(int i=1;i<array.length;i++){
                        if(temp[result-1] !=array[i]){
                                temp[result]=array[i];
                                result++;
                        }
                }
                return temp;
        }

        /*Move zero to the end and keep order of other element same in Big O (n^2)*/
        public int[] moveZeroesToEnd(int[] array){

        for(int i=0;i<array.length;i++){

                if(array[i]==0){

                        for (int j = i+1;j<array.length;j++){
                                if(array[j]!=0){
                                        swap(array,j,i);
                        }

                }

        }

        }

return array;

}

        /*Move zero to the end and keep order of other element same in Big O (n)*/


        public static int[] moveZeroInSortedArray(int[] array){

                int count =0;
                for(int i=0;i<array.length;i++){
                        if(array[i] != 0){
                                swap(array,i,count);
                                count++;
                        }

                }

                return array;

        }

        private static int[] swap(int[] array,int i, int i1) {

                int temp = array[i];
                array[i] = array[i1];
                array[i1] = temp;
                return array;
        }

        /*Left rotate by k for now k =1
        *
        * {1,2,3,4,5}
        * {2,3,4,5,1}
        * */

        public static int[] leftRotateByK(int[] array,int k ){
                        int temp = array[0];
                        for(int i = 1;i<array.length;i++){
                                array[i-1]=array[i];
                        }
                        array[array.length-1]=temp;
                return array;
        }

        /*Left rotate by k and k can be any integer
        *  I/p:-{1,2,3,4,5}
        * if k is 2
        * O/p:- {3,4,5,1,2}
        *
        * */


}


