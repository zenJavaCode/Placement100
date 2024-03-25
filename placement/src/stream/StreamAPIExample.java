package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,4,2,8,9,1);
        Stream<Integer> data = nums.stream();
        data.forEach(n -> System.out.println(n));
      


    }
}
