package StreamAPICodingQuestions;

import java.util.*;

public class questionThree {

    public static void main(String[] args) {

        List<Integer> list = List.of(12, 13, 1, 18, 12, 14, 15, 13);

        Set<Integer> set = new HashSet<>();

        list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

    }
}
