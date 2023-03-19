package com.abc.input;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileInputStreamBasic3 {
    public static void main(String... args) throws Exception {

        FileInputStream fis = new FileInputStream("/Users/ganeshkulkarni/Downloads/a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
        int data;
        byte b[] = new byte[128];
        while ((data = bufferedInputStream.read(b)) != -1) {
            if (data != -1)
                System.out.println(new String(b, 0, data-1));
        }
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

        //Scanner s = new Scanner(System.in);

        DataInputStream dis = new DataInputStream(new BufferedInputStream(System.in));
        String ss = dis.readLine();
        System.out.println(ss);
    }
}
