package com.abc.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBasic {
    public static void main(String ...a){
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("/Users/ganeshkulkarni/Downloads/a.txt");
            int data ;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char)data);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader !=null) {
                    fileReader.close();
                }
            }catch (Exception e){
                fileReader = null;
            }
        }
    }
}

