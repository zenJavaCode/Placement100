package hashing;

import java.util.*;
import java.util.stream.Collectors;

public class HashingProblems {
    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;

            /* If the above inner loop
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == m)
                return false;
        }

        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }

    // Driver code
    public static void main(String args[]) {
        List<String> inputArr = new ArrayList<>();
        inputArr.add("AB");
        inputArr.add("BB");
        inputArr.add("AA");
        inputArr.add("AB");
        inputArr.add("ABC");
        Map<String, Long> duplicateElementWithCount = inputArr.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateElementWithCount);

        Map<String, Integer> elementCounts = new HashMap<>();
        for (String str : inputArr) {
            if (elementCounts.containsKey(str)) {
                elementCounts.put(str, elementCounts.get(str) + 1);
            } else {
                elementCounts.put(str, 1);
            }
        }
        // Filter elements with count greater than 1 (duplicates)
        Map<String, Integer> duplicateElementsWithCount = new HashMap<>();
        for (Map.Entry<String, Integer> entry : elementCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateElementsWithCount.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(duplicateElementsWithCount);


//        int arr1[] = {11, 1, 13, 21, 3, 7};
//        int arr2[] = {11, 3, 7, 1};
//
//        int m = arr1.length;
//        int n = arr2.length;
//
//        if (isSubset(arr1, arr2, m, n))
//            System.out.print("arr2[] is "
//                    + "subset of arr1[] ");
//        else
//            System.out.print("arr2[] is "
//                    + "not a subset of arr1[]");
    }


    // TODO: hashing approch:-
    static boolean isSubsetHashSet(int arr1[], int arr2[], int m, int n) {
        HashSet<Integer> hset = new HashSet<>();
        // hset stores all the values of arr1
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }
        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int i = 0; i < n; i++) {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }

    /*TODO:Find a pair with the given sum in an array*/
    public static void findPair(int[] num, int target) {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(target - num[i])) {
                System.out.printf("Pair found (%d, %d)",
                        num[map.get(target - num[i])], num[i]);
                return;
            }
            map.put(num[i], i);
        }
        System.out.println("Pair not found");

    }
    /*TODO:Check if subarray with 0 sum is exists or not*/

    public static Boolean subArrayZeroSum(int[] num) {

        Set<Integer> set = new HashSet<>();

        set.add(0);
        int sum = 0;

        for (int value : num) {
            sum += value;

            if (set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }
        return false;
    }

    /*TODO:Print all sub-arrays with 0 sum*/
    public static void printAllSubArrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                System.out.println("sub array found from index 0 to " + i);
            }


            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int index : indices) {
                    System.out.println("Sub-array found from index " + (index + 1) + " to " + i);
                }
            }

            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);

        }
    }


    public static void printSubarraysWithSumZero(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0;
        prefixSum.put(0, -1); // Handle empty subarray with 0 sum

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (prefixSum.containsKey(sum)) {
                // Subarray found between prefixSum.get(sum) + 1 and i (inclusive)
                for (int j = prefixSum.get(sum) + 1; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            prefixSum.put(sum, i);
        }
    }


    // TODO:=  Write a Java 8 program to find only duplicate elements with its count from the String ArrayList ? InputArr=["AB", "BB", "AA", "AB", "ABC"]


    public static void onlyDuplicateElement(String[] args) {
        List<String> inputArr = new ArrayList<>();
        inputArr.add("AB");
        inputArr.add("BB");
        inputArr.add("AA");
        inputArr.add("AB");
        inputArr.add("ABC");
Map<String,Long> duplicateElementWithCount = inputArr.stream().collect(Collectors.groupingBy(s ->s, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() >1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(duplicateElementWithCount);


    }

    public static Map<String, Long> findDuplicateElements(List<String> inputArr) {
        return inputArr.stream()
                .collect(
                        // Group elements by their identity and count occurrences
                        HashMap::new,
                        (map, element) -> map.merge(element, 1L, Long::sum),
                        HashMap::putAll
                );
    }


    /*TODO  Longest Subarray With Sum K.*/

    public static int longestSubArrayWithSumK(int[] a ,int k) {
        int n = a.length;

        int length = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];

                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }

            }

        }
    return length;

    }

    // using hashing

    public static int longestSubArrayWithSumHashing(int[] a,int k){
        Map<Integer,Integer> map = new HashMap<>();
            int maxLen =0;
            int sum=0;
        for(int i =0;i<a.length;i++){
            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (map.containsKey(rem)) {
              int len = i- map.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

/*TODO There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.

Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values.*/


    public static int[] alternateNumber(int[] a ){

        int[] temp = new int[a.length];
        int pos =0;
        int neg =1;
        for(int i =0;i<a.length;i++){
            if(a[i] >= 0){
                a[pos] = a[i];
                pos +=2;
            }else{
                a[neg] = a[i];
                neg += 2;
            }
        }
        return temp;
    }

    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer>list = new ArrayList<>();
        int lead = Integer.MIN_VALUE;
        for(int i = a.length-1;i>=0;i--){
            if(a[i]>lead){
                lead = a[i];
                list.add(a[i]);
            }
        }



    return list;
    }






}
