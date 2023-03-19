package com.abc.input;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamBasic {
    public static void main(String... args) {
        FileOutputStream fw = null;
        try {
            fw = new FileOutputStream("/Users/ganeshkulkarni/Downloads/aa.txt", true);
            String ss = "abcbcdjkhhfskfhsh\\hfhf\\rfdjkhfhsk\\nfhsfhsdfhsfdhffkhqueyzlajysjflfibdh180575j,d;']\\=0u1az   `etdhjfshfsfangehssfdnewgsdadhjdgyakdhajddkfhdjfdfkdhfdhfdkfdhfdjfhdfhdfhdfhfhdsfhskfhsdjhf";
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
