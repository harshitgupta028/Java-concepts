package StreamCreation;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {

    public static void main(String[] args) {

        Integer[] arr = { 10, 20, 30, 40 };

        // I have got the stream of array now I can perform the
        // Intermediate and terminal operations based on the requirement
        Stream<Integer> stream = Arrays.stream(arr);
    }
}
