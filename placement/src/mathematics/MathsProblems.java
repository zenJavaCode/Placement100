package mathematics;

public class MathsProblems {

    public static void main(String[] args) {
        //  System.out.println(countNumber(50000));
        //   System.out.println(isPalindromeNumber(78988));
        //    System.out.println(isPalindromeStringUsingTwoPointer("PAWAP"));
        System.out.println(factorialOfNumber(5));

    }


    //trailing zero in the end of a factorial of a number

    public static int trailingZeroInTheEnd(int number){
        Long num = factorialOfNumberUsingRecursion(number);
        int count =0;
       /*
        char[] array = num.toString().toCharArray();
        for(int i=array.length-1;i>=0;i--){
            if(array[i]==0) count++;
        }
        return count;*/
        while(num%10 ==0){
            count++;
            num= num/10;
        }
        return count;
    }

    //Palindrome of a number using native approach or bruteforce approach
    public static boolean isPalindromeString(String x) {

        char newName;
        StringBuilder s = new StringBuilder();
        char[] array = x.toCharArray();
        for (int i = x.length() - 1; i >= 0; i--) {

            newName = array[i];
            s.append(newName);
        }
        if (x.equals(s)) return true;

        return false;
    }
    //Palindrome of a String using Two Pointer approach

    public static boolean isPalindromeStringUsingTwoPointer(String x) {

        char[] array = x.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j]) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;

    }


    // factorial of Number brute force

    public static Long factorialOfNumber(int num) {

        Long result = 0L;
        for (int i = num; i > 0; i--) {
            int sum = num * num - 1;
            result += Long.parseLong(String.valueOf(sum));
        }
        return result;

    }

    // factorial of a number using recursion

    public static Long factorialOfNumberUsingRecursion(int num) {

        if (num == 0)
            return 1L;
        return num * factorialOfNumberUsingRecursion(num - 1);
    }


    //count digits of given number

    public static int countNumber(int x) {
        int res = 0;

        while (x > 0) {
            x = x / 10;
            res++;
        }
        return res;
    }

    //
    public static boolean isPalindromeNumber(int x) {
        int temp = x;
        if (x <= 9 && x > 0) return true;

        int rev = 0;
        while (x > 0) {

            int last = x % 10;
            rev = rev * 10 + last;
            x = x / 10;
        }
        if (temp == rev) return true;
        else return false;

    }


}
