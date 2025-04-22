package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {

        Consumer<Integer> consumer = (i) -> System.out.println(i);
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.forEach(consumer);


        // The above code can be simplified to with a method reference or lambda expression
        Stream.of(1,2,3,4,5,6,7,8,9)
                .forEach(System.out::println);

    }
}

// The Stream.of() method is used to create a stream from a set of values.