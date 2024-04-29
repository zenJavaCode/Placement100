import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }

    public static void main(String[] args) {

method(null);
        List<String> strings = Arrays.asList("cat", "dog", "bat", "rat", "apple", "banana", "car");


        /*TODO:Given a list of strings, write a Java program to count the number of strings that start with a specific letter and have a length of exactly 3 characters. */
        long count = strings.stream().filter(s -> s.startsWith("b") && s.length() == 3).count();


        /*TODO: Given a list of integers, write a Java program to find the sum of all even numbers in the list.*/
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        /*TODO: Given a list of strings, write a Java program to concatenate all strings into a single string, separated by a comma.*/
        String s = strings.stream().collect(Collectors.joining(", "));

        /*TODO: Given a list of integers, write a Java program to find the maximum and minimum values in the list.*/
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);



    }
}
