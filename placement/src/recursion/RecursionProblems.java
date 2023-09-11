package recursion;

public class RecursionProblems {

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


}
