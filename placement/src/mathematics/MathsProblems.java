package mathematics;

public class MathsProblems {

    public static void main(String[] args) {
        //  System.out.println(countNumber(50000));
     //   System.out.println(isPalindromeNumber(78988));
        System.out.println(isPalindromeStringUsingTwoPointer("PAWAP"));


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


    // factorial of Number


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
