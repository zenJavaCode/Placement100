package arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.stream(number).filter(n -> n % 2 ==0).boxed().collect(Collectors.toList());

        /*Write a Java program to calculate the average of a list of integers using streams.*/
        List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        Double sum = nums.stream().mapToDouble(Integer ::doubleValue).average().orElse(0.0);


        List<String> stringList=new ArrayList<String>();
        //Adding elements in the List
        stringList.add("Mango");
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Grapes");
        /*Write a Java program to convert a list of strings to uppercase or lowercase using streams.*/
        List<String> upperCaes = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());

        /*Write a Java program to calculate the sum of all even, odd numbers in a list using streams.*/
        int totaleven = Arrays.stream(number).filter(n -> (n & 2) ==0).sum();
        System.out.println(totaleven);

        /*Write a Java program to remove all duplicate elements from a list using streams.*/

        List<Integer> distinctElements = Arrays.stream(number).distinct().boxed().collect(Collectors.toList());

        /*Write a Java program to count the number of strings in a list that start with a specific letter using streams.*/
         List<String> count =  stringList.stream().sorted().collect(Collectors.toList());


/*. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.*/
       List<String> reverseString =   stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

       reverseString.stream().forEach(s -> System.out.println(s+ " "));



       /*Write a Java program to find the maximum and minimum values in a list of integers using streams*/
        Integer max = Arrays.stream(number).min().orElse(0);
        System.out.println("max is :"+max);

        /* Write a Java program to find the second smallest and largest elements in a list of integers using streams.*/

        Integer secondSmallest = Arrays.stream(number).distinct().sorted().skip(1).findFirst().orElse(-1);




        Integer secondLargest = nums.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);


        /*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> updatedList = myList.stream().map(s -> s +"").filter(s -> s.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());

/* Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/

        /* How to find duplicate elements in a given integers list in java using Stream functions?*/
        Set<Integer> sets = new HashSet();
        Integer duplicate = myList.stream().filter(n -> !sets.add(n)).findFirst().orElse(null);

        System.out.println("duplicate : "+duplicate);

       Set<Integer> set = new HashSet<>();
       myList.stream().filter(n-> !set.add(n)).forEach(System.out::println);


        int countsss = myList.stream().max(Integer::compare).get();


     //TODO   7. Given a String, find the first non-repeated character in it using Stream functions?

        String input = "Java articles are Awesome";

        Stream<Character> charStream =input.chars().mapToObj(c -> (char) c);

        Character c = charStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() >1).findFirst().map(Map.Entry::getKey).orElse(null);











































    }
}
