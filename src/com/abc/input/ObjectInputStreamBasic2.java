package com.abc.input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamBasic2 {
    public static void main(String... args) {
        Student student = new Student();
        student.setName("Ganesh");
        student.setAddress("djkdjagdjsakgdajdd dsjkhdakdjashd dshkahdakhdkajd dakhdshaskdha");
        student.setId(1000);
        student.setMobileNo("997634675474");
        //System.out.println(student);

        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream("/Users/ganeshkulkarni/Downloads/student.txt");
            ObjectOutputStream os = new ObjectOutputStream(System.out);
            os.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                fos = null;
            }
        }

        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("/Users/ganeshkulkarni/Downloads/student.txt");
//            int data;
//            while ((data = fis.read()) != -1) {
//                System.out.print((char)data);
//            }
            ObjectInputStream ois = new ObjectInputStream(System.in);
            Student readObject = (Student) ois.readObject();
            System.out.println(readObject);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    fis = null;
                }
            }
        }
    }
}
