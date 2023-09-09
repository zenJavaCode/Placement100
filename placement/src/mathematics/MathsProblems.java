package mathematics;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MathsProblems {

    public static void main(String[] args) {
        //  System.out.println(countNumber(50000));
        //   System.out.println(isPalindromeNumber(78988));
        //    System.out.println(isPalindromeStringUsingTwoPointer("PAWAP"));
        //   System.out.println(trailingZeroInTheEnd(251));
     //   System.out.println(lcmBruteForce(4, 6));
     //   quadraticRoots(752 ,904 ,164);
      //  System.out.println(factorialOfNumber(42));
        //System.out.println(exactly3Divisors(10));
        System.out.println(termOfGP(84,87,3));



    }


    //trailing zero in the end of a factorial of a number

    public static int trailingZeroInTheEnd(int number) {

        LocalTime time = LocalTime.now();
        System.out.println("in the starting" + time);

        Long num = factorialOfNumberUsingRecursion(number);
        int count = 0;

        while (num % 10 == 0) {
            count++;
            num = num / 10;
        }
        System.out.println("in the end");
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        return count;
    }


    // A function that takes 2 number as parameter and returns the Greatest common divisor of  both.

    public static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    //gcd Euclidean's algorithm
    public static int gcdEuclidean(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = (a - b);
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //optimised Euclideans algorithm
    public static int gcdOptimised(int a, int b) {
        if (b == 0) {
            return a;
        } else return gcdOptimised(b, a % b);
    }

    /*LCM of a number*/
    public static int lcmBruteForce(int a, int b) {
        int res = Math.max(a, b);
        if (a % b == 0 || b % a == 0) return Math.max(a, b);
        else {
            // I need to find the prime factor of both the number.
            while (res > 0) {

                if (res % a == 0 && res % b == 0) {
                    break;
                }
                res++;
            }
        }
        return res;
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

    public static int factorialOfNumber(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial.toString().length();

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

    public static String getCurrentTimeWithMilliseconds() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();

        // Define a format for displaying milliseconds
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSSS");

        // Format the current time with milliseconds
        String formattedTimeWithMilliseconds = currentTime.format(formatter);

        return formattedTimeWithMilliseconds;
    }

    /*Check whether number is prime or not ? naive solution*/
    public static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // check whether the number is Prime Or Not.
    public static boolean isPrimeNumber(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        for (int i = 5; i * i < n; i = i + 6) {

            if (n % i == 0 || n % (i + 2) == 0) return false;

        }
        return true;
    }

    // roots of a quadratic equation
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        Integer det =  b * b - 4 * a * c;
        Double first =  ((-b + Math.sqrt(det)) / (2 * a));
        Double second =  ((-b - Math.sqrt(det)) / (2 * a));
        Integer v =(int)Math.floor(first);
        Integer x = (int)Math.floor(second);
        second.intValue();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Math.toIntExact(Math.round(first)));
        result.add(Math.toIntExact(Math.round(second)));
        return result;

    }


    //Exactly 3 divisors
    public static int exactly3Divisors(int N)
    {
        //Your code here
        int count = 0;
        for (int num = 2; num * num <= N; num++) {
            if (isPrime(num)) {
                // If num is prime and its square is less than or equal to N,
                // then it has exactly 3 divisors (1, num, and num*num)
                count++;
            }
        }
        return count;
    }

    public int countNumbersWith3Divisors(int N) {
        int count = 0;
        for (int num = 2; num <= N; num++) {
            if (isPrimeCorrect(num)) {
                int square = num * num;
                if (square <= N) {
                    count++;
                } else {
                    break; // No need to check further as the square exceeds N
                }
            }
        }
        return count;
    }

    public boolean isPrimeCorrect(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }


    //nth term of a GP
    public static double termOfGP(int A,int B,int N)
    {
        //Your code here
        if(N ==1)return A;
        if(N==2) return B;
        double r = B/A;

        return  A* Math.pow(r,N-1);


    }



}
