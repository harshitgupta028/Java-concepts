package StreamAPICodingQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class questionTwo {

    public static void main(String[] args) {

        List<Integer> list = List.of(12, 43, 123, 55, 45, 10);

        // One
        List<Integer> transformedData = list.stream().map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList());
        System.out.println(transformedData);

        // Two
        list.stream().map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .forEach(n -> System.out.print(n + " "));
    }
}
