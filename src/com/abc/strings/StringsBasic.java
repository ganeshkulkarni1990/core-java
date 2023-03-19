package com.abc.strings;

import java.time.Instant;
import java.util.*;
public class StringsBasic {

    public static void main(String... args) {

        String s ="abc";
        String ss ="abc";
        String ss1 ="abcd";

        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(ss1.hashCode());

        //how object quality is checked?
        // first hashCode is checked if hashCode are different then they are different objects
        //if there hashCode is same then they may or may not same object
        //then you need to compare using equals

        Date start = Date.from(Instant.now());
        String sss = "abc" + "bcfgdgdfgfd" + "fdgdfgdfgdgdgdgdgdffdgfgdggdgdgdgfd" + "kdshhjd" + "dsdhsa";
        System.out.println(sss);
        Date end = Date.from(Instant.now());
        long totalTime = end.getTime() - start.getTime();
        System.out.println(totalTime);

        start = Date.from(Instant.now());
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append("bcfgdgdfgfd");
        sb.append("fdgdfgdfgdgdgdgdgdffdgfgdggdgdgdgfd");
        sb.append("kdshhjd");
        sb.append("dsdhsa");
        end = Date.from(Instant.now());
        totalTime = end.getTime() - start.getTime();
        System.out.println(totalTime);

        System.out.println(sb.toString());


        start = Date.from(Instant.now());
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("abc");
        sBuffer.append("bcfgdgdfgfd");
        sBuffer.append("fdgdfgdfgdgdgdgdgdffdgfgdggdgdgdgfd");
        sBuffer.append("kdshhjd");
        sBuffer.append("dsdhsa");
        end = Date.from(Instant.now());
        totalTime = end.getTime() - start.getTime();
        System.out.println(totalTime);

        System.out.println(sBuffer.toString());


     }
}
