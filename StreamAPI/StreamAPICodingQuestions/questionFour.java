package StreamAPICodingQuestions;

import java.util.List;

public class questionFour {

    public static void main(String[] args) {

        // Integer stream
        List<Integer> intList = List.of(12, 23, 14, 15);
        intList.stream().findFirst().ifPresent(n -> System.out.println(n));

        // String stream
        List<String> strList = List.of("This", "is", "java", "stream", "tutorial");
        strList.stream().findFirst().ifPresent(System.out::println);

    }
}
