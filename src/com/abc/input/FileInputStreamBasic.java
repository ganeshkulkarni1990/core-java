package com.abc.input;

import java.io.FileInputStream;

public class FileInputStreamBasic {
    public static void main(String... args) throws Exception {

        FileInputStream fis = new FileInputStream("/Users/ganeshkulkarni/Downloads/a.txt");
        fis.skip(7);
        int data = fis.read();
        //reading char by char is time consuming
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
    }
}
