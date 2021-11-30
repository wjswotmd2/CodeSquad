package Pratice02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class MyComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        //내림차순
        return (s2.compareTo(s1)) - 1;
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(new MyComparator());

        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);

        System.out.println(set.size());
    }
}
