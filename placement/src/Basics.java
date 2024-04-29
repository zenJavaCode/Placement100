import java.util.Arrays;

public class Basics {

    /*TODO:-  Write a Program to Reverse a given Number N by user*/

    public static void main(String[] args) {
//        int n = 1834;
//        int results = 0;
//
//
//        while (n != 0) {
//            int digit = n % 10;
//            results = results * 10 + digit;
//            n /= 10;
//        }
//        System.out.println(results);

        int[] nums = {1, 1, 2, 2,3};
//       int num =  getSingleElement(nums);
//        missingNumber(nums);
    }
    public static String read(int n, int []book, int target){
        // Write your code here.

        int left = 0;
        int right = book.length-1;
        while(left<right){
            if((book[left] + book[right]) == target){
                return "YES";
            }else{
                left++;
                right--;
            }

        }
        return "NO";
    }





    public static int getSingleElement(int[] nums) {
        for(int i =0;i<nums.length-1; i =i+2){
        if(nums[i] !=nums[i+1]){
            return nums[i];
        }
        }
        return nums[nums.length-1];
    }

    public static int consecutiveOnes(int[] nums){
        int count = 0,ans =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                ans = Math.max(ans,count);
                count =0;
            }

        }
        return Math.max(ans,count);


    }


    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        int i =0;
        for( i =0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return i+1;

    }


/*
    TODO:-  Write a Program to display sum of all digits of a given
            Number N by user
*/


    public static int sumOfDigits(int n) {

        int results = 0;
        while (n != 0) {
            int digit = n % 10;
            results = results + digit;
            n /= 10;
        }
        return results;

    }


    /*TODO: Write a Program to Calculate Power of a Number
            using inbuilt pow() function by taking two inputs from
            users as Base and exponent respectively*/

    public static Double powerOfANumber(double base, double power) {
        return Math.pow(power, base);
    }


    /*TODO :- Write a Program to Calculate Power of a Number
            without using inbuilt pow() function by taking two
            inputs from users as Base and exponent respectively*/
    public static int powerOfAIntegerNumber(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return base;

    }

    /*TODO Write a Program to Check Whether a Number N entered by user is Palindrome or Not*/

    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        return (reversedNum == number);
    }

    /*TODO Write a Program to Check Whether a Number is Prime or Not*/
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

            for (int i = 2; i*i<=n; i++) {
                if(n % i ==0){
                    return false;
                }
            }
            return true;

    }

/*TODO:- ) Write a Program to Display Prime Numbers Between Two Intervals (entered by user)
           Example:Enter two numbers: 0 20 Prime numbers between 0 and 20 are:2 3 5 7 11 13 17 19
*/



}
