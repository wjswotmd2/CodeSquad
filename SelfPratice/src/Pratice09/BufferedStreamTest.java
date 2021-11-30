package Pratice09;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {

        long millisecond = 0;

        try(FileInputStream fis = new FileInputStream("심슨가족 시즌1 EP 01.zip")) {
        FileOutputStream fos = new FileOutputStream("copy2.zip");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos =new BufferedOutputStream(fos);
            millisecond = System.currentTimeMillis();
            int i;
            while((i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사하는데" + millisecond + "millisecondes 소요되었습니다.");
    }
}
