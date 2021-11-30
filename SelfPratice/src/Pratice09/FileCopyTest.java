package Pratice09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest{

    public static void main(String[] args) {


    long millisecond = 0;

    try(FileInputStream fis = new FileInputStream("심슨가족 시즌1 EP 01.zip")) {
        FileOutputStream fos = new FileOutputStream("copy.zip");

        millisecond = System.currentTimeMillis();
        int i;

        while((i = fis.read()) != -1) {
            fos.write(i);
        }
        millisecond = System.currentTimeMillis() - millisecond;
    } catch(IOException e) {
        e.printStackTrace();
    }
    }
}
