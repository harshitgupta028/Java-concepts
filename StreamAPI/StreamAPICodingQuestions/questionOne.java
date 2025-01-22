package StreamAPICodingQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class questionOne {

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 38, 43, 2, 56);

        // One
        List<Integer> filteredList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        // Two
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

    }
}
