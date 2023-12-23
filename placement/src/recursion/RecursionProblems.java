package recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RecursionProblems {



    //print N to 1 using recursion

    public static void printNum(int num) {

        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            printNum(num - 1);
        }
    }

    //Rope cutting problem
    public static void main(String[] args) {
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result = Collections.singletonList(names.stream().sorted().collect(Collectors.toList()));

        System.out.println(result.toString());
    }

}
