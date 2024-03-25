package arrays;


import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int[] arr = {0, 0, 0, 10, 0};
        moveZerosToEnd(arr);

    }

    public int removeElement(int[] array, int element) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == element) {
                break;
            }
        }
        if (i == array.length) {
            return -1;
        }
        for (int j = i; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        return array.length - 1;
    }

    /*Largest Element in  an Array.*/

    public int largestElement(int[] array) {

        int max = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    /*Largest element index in an array in single loop or Big O(n).*/

    public static int largestElementIndex(int[] array) {
        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[result]) {
                result = i;
            }
        }
        return result;
    }


    /*Second largest in Big O(n)*/

    public static int secondLargestElement(int[] array) {
        int result = Integer.MIN_VALUE;
        int largestElementIndex = 0;
        for (int i = 1; i < array.length; i++) {
            // first condition is whether the ith element is greater than the largest element
            if (array[i] > array[largestElementIndex]) {
                result = largestElementIndex;
                largestElementIndex = i;
            } else if (array[i] != array[largestElementIndex]) {
                if (result == -1 || array[i] > array[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    /*Check if array is sorted or not and only check in non-decreasing order and equal are allowed.*/

    public boolean isSorted(int[] array) {
        int count = 0;
        for (int i = 1; i <= array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
    /*Reverse an Array, array.length gives size of the array*/
    // also k/as two pointer technique.

    public int[] reverseArray(int[] array) {

        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
        return array;
    }

    /*Remove duplicates from the sorted array*/
    //TODO: Revise it again and try to understand the problem better.

    public int[] removeDuplicatesFromSortedArray(int[] array) {

        int[] temp = new int[array.length];
        temp[0] = array[0];
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (temp[result - 1] != array[i]) {
                temp[result] = array[i];
                result++;
            }
        }
        return temp;
    }

    /*Move zero to the end and keep order of other element same in Big O (n^2)*/
    public int[] moveZeroesToEnd(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        swap(array, j, i);
                    }

                }

            }

        }

        return array;

    }

    /*Move zero to the end and keep order of other element same in Big O (n)*/


    public static int[] moveZeroInSortedArray(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                swap(array, i, count);
                count++;
            }

        }

        return array;

    }

    private static int[] swap(int[] array, int i, int i1) {

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

    public static int[] leftRotateByOne(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
        return array;
    }

    /*Left rotate by k and k can be any integer
     *  I/p:-{1,2,3,4,5}
     * if k is 2
     * O/p:- {3,4,5,1,2}
     *
     * */


    public static int largestElementInArray(int[] args) {
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }
        }
        return max;
    }


    public static int secondLargestElementInArray(int[] args) {
        int res = -1, largest = 0;
        if (args.length < 2) {
            return -1;
        }
        for (int i = 1; i < args.length; i++) {
            if (args[i] > args[largest]) {
                res = largest;
                largest = i;
            } else if (args[i] < args[largest]) {
                if (res == -1 || args[i] > args[res]) res = i;
            }
        }
        return res;
    }

    public static boolean checkIfArrayIsSortedOrNot(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }


    //Reverse Elements of an array.

    public static void reverseAnArray(int[] array) {

        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;

        }
    }


    //clear
    public static void moveZerosToEnd(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                swap(a, i, count);
                count++;
            }
        }
    }


    //Remove duplicates form sorted array.

    public static void removeDuplicateFormArray(int[] arr) {
        int[] newArray = new int[arr.length];
        newArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                newArray[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void removeDuplicateFromArrayInConstantSpace(int[] arr) {
        int writeIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }
    }


    /*Left Rotate by K*/
    public static int[] leftRotateByK(int[] array, int k) {
       int[] temp = new int[k];
       for(int i =0;i<k;i++)
           temp[i] = array[i];

       for(int i = k;i<array.length;i++)
           array[i-k] = array[i];

       for(int i =0;i<array.length;i++)
           array[array.length-k+i] = temp[i];

       return array;
    }

    public  static void leadersInArray(int[] arr){
        int highestElement = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] > highestElement){
                highestElement = arr[i];
                System.out.print(arr[i] +" ");
            }

        }








    }









}


