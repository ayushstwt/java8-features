package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        Student ayush = new Student(1L, "Ayush", "1234567890", 20);
        Student shivam = new Student(2L, "Shivam", "0987654321", 22);
        Student akash = new Student(3L, "Akash", "1122334455", 21);
        Student abhilash = new Student(4L, "Abhilash", "5566778899", 23);

        List<Student> studentList = Arrays.asList(ayush, shivam, akash, abhilash);
        Stream<Student> studentStream = studentList.stream();
        studentStream.forEach(System.out::println);

    }
}
