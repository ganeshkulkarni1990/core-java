package com.abc.input;

import java.io.FileInputStream;

public class FileInputStreamBasic2 {
    public static void main(String... args) throws Exception {

        FileInputStream fis = new FileInputStream("/Users/ganeshkulkarni/Downloads/a.txt");

        //read at time more bytes
        //your performance increased
        byte bytes[] = new byte[128];
        int bytesRead = fis.read(bytes);
        System.out.println("Data: " + new String(bytes, 0, bytesRead - 1) + " Size:" + bytesRead);
        //reading char by char is time consuming
        while (bytesRead != -1) {
            bytesRead = fis.read(bytes);
            if (bytesRead != -1) {
                System.out.println("Data: " + new String(bytes, 0, bytesRead - 1) + " Size:" + bytesRead);
            }
        }
    }
}
