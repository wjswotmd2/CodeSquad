package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add(new String("임정순"));
        hashSet.add(new String("박현정"));
        hashSet.add(new String("홍연희"));
        hashSet.add(new String("유손"));
        hashSet.add(new String("전재승"));

        System.out.println(hashSet);

        Iterator<String> it = hashSet.iterator();

        while (it.hasNext()) {

            String s = it.next();

            System.out.println(s);
        }
    }
}
