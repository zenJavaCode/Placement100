package recursion;

public class RecursionProblems {


    /*Whenever we call a recursion function there is an initialization
    * and there must be a base condition to terminate the function
    * we have to take care of the less function 
    * */

    public static void main(String[] args) {
      //  printNum(10);
        System.out.println( sumRecursive(5));

    }

    //print N to 1 using recursion

    public static void printNum(int num) {

        if (num == 0) {
            return ;
        } else {
            System.out.println(num);
            printNum(num - 1);
        }
    }


   // sum of N natural numbers using recursion

    public static int sumRecursive(int N){

        if(N==0){
            return 0;
        }
        return N+sumRecursive(N-1);

    }

    // check for palindrome using recursion

    public static boolean isPalindromeUsingRecursion(String s,int low,int high){
        if(low>=high)return true;
        return (s.charAt(low)==s.charAt(high) && isPalindromeUsingRecursion(s,low+1,high-1));
    }

    //Rope Cutting problem

    public static int ropeCut(int n,int a,int b,int c){
        return -1;
        //find the smallest of a,b,c. then
    }



}
