package com.abc.input;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBasic {
    public static void main(String... args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/ganeshkulkarni/Downloads/aa.txt", true);
            String ss = "abcbcdjkhhfskfhshfdjkhfhskfhsfhsdfhsfdhffkhdfdhftetdhjfshfsfangehssfdnewgsdadhjdgyakdhajddkfhdjfdfkdhfdhfdkfdhfdjfhdfhdfhdfhfhdsfhskfhsdjhf";
            char ca[] = ss.toCharArray();
            int i = 8;
            for (Character c : ca) {
                fw.write(c);
                i--;
                if (i == 0) {
                    fw.write('\n');
                    i = 8;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw != null) {
                    fw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
                fw = null;
            }
        }
    }
}
