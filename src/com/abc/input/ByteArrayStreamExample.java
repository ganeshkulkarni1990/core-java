package com.abc.input;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.util.HashSet;

public class ByteArrayStreamExample {
    public static void main(String... args) {

        String test = "abcdefghijklmnopqrstuvwxyz";
        ByteArrayInputStream bis = new ByteArrayInputStream(test.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream(12);
        System.out.println(bis.available());
        int data;
        while ((data = bis.read()) != -1) {
            System.out.println((char) data);
            bos.write(data);
        }
        System.out.println();

        ByteArrayInputStream bis1 = new ByteArrayInputStream(bos.toByteArray());
        while ((data = bis1.read()) != -1) {
            System.out.println((char) data);
        }

        System.out.println();
        int count = 0;
        StringBufferInputStream ios = new StringBufferInputStream(test);
        while ((data = ios.read()) != -1) {
            if (++count == 5) {
                System.out.println("Available:" + ios.available());
            }
            System.out.println((char) data);
        }
        System.out.println();
    }
}
