package com.abc.controlflow;

public class Switch2
{
    final static short x = 2;
    public static int y = 0;

    public static void test() {
        int i = 1, j = -1;
        switch (i)
        {
            case 1: j = 1;
            case 2: j = 2;
            default: j = 5;
        }
        System.out.println("j = " + j);
    }

    public static void main(String [] args) 
    {
        for (int z=0; z < 4; z++)
        {
            switch (z)
            {
                case x: System.out.print("0 ");
                default: System.out.print("def ");
                case x-1: System.out.print("1 ");
                            break;
                case x-2: System.out.print("2 ");
            }
        }
        test();
    }
}