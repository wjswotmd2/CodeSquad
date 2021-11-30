package Pratice07;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("연애의 기술", 20000));
        bookList.add(new Book("자바의 기술", 25000));
        bookList.add(new Book("파이썬의 기술", 30000));
        bookList.add(new Book("키스의 기술", 15000));

        System.out.println("== 책의 총합 구하기 ==");

        int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();

        System.out.println("총합 : " + total);

        System.out.println("== 20000원 이상의 책 이름순 정렬 ==");

        bookList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).
            sorted().forEach(s -> System.out.println(s));
    }
}
