package Practice;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("홍길동");
        treeSet.add("전재승");
        treeSet.add("유손");

        for(String str : treeSet) {
            System.out.println(str);
        }
    }
}
