package Pratice09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MyTest {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("a.txt");
            OutputStreamWriter oos = new OutputStreamWriter(fos)) {
            oos.write("지금까지 자바 정말 재미있게 공부했어요^^");
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("a.txt 생성 완료");
    }
}
