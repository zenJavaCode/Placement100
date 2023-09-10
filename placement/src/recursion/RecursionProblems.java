package recursion;

public class RecursionProblems {

    public static void main(String[] args) {
        printNum(10);

    }

    //print N to 1 using recursion

    public static void printNum(int num) {

        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            printNum(num - 1);
        }
    }
}
