package StreamAPICodingQuestions;

import java.util.List;

public class questionSix {

    public static void main(String[] args) {

        List<Integer> intLis = List.of(12, 14, 56, 75, 75, 78);

        System.out.println(intLis.stream().max(Integer::compare).get());
    }
}
