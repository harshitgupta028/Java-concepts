package StreamCreation;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class StreamFromCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // I have got the stream of List now I can perform the
        // Intermediate and terminal operations based on the requirement
        Stream<Integer> listStream = list.stream();

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 65);
        map.put("E", 69);
        map.put("I", 73);
        map.put("O", 79);
        map.put("U", 85);

        // I have got the stream of Map now I can perform the
        // Intermediate and terminal operations based on the requirement
        Stream<Entry<String, Integer>> mapStream = map.entrySet().stream();
    }
}