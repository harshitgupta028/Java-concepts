package StreamCreation;

import java.util.stream.Stream;

class InfiniteStream {

    public static void main(String[] args) {

        // I have got the infinite stream(I'v limited to 10 ) now I can perform the
        // Intermediate and terminal operations based on the requirement
        Stream<Integer> intStream = Stream.iterate(0, n -> n + 1).limit(10);

    }
}