package streams;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        // Streams API is used to process a data stream.
        //  Streams are used to process collections of objects in a functional way.
        //  Streams are not data structures, they do not store data.

        Supplier<String> supplier= ()-> "Hello streams";

        Consumer<String> cunsumer= (s)-> System.out.println(s);

        Stream<String> streamOfStrings = Stream.generate(supplier);

        streamOfStrings.forEach(cunsumer);

    }
}


// generate() method is used to generate an infinite stream of data.
//  The limit() method is used to limit the number of elements in the stream.
//  The forEach() method is used to process each element in the stream.
