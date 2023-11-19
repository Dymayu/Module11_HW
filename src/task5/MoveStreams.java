package task5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoveStreams {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Object[] array1 = first.toArray();
        Object[] array2 = second.toArray();

        int size1 = array1.length;
        int size2 = array2.length;

        int maxSize = Math.min(size1, size2);

        return (Stream<T>) IntStream.range(0, maxSize)
                .mapToObj(i -> Stream.of(array1[i], array2[i]))
                .flatMap(Function.identity());

    }

    public static void main(String[] args) {

        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8, 9, 10, 11);
        Stream<Integer> combinedStream = zip(firstStream, secondStream);

        combinedStream.forEach(System.out::println);

    }
}
