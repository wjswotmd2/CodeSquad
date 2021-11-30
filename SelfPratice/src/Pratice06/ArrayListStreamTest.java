package Pratice06;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        ArrayList<String> sList = new ArrayList<>();

        sList.add("전재승");
        sList.add("유손");
        sList.add("김선생");
        sList.add("마이사");

        Stream<String> stream = sList.stream();

        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
