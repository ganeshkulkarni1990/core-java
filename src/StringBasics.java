import java.util.Arrays;
import java.util.Random;

class AA {
    int i;
    int j;
}
public class StringBasics extends Object {
    private static void printArray(String a[]){
        System.out.print("[");
        for(String s: a){
            System.out.print(s+",");
        }
        System.out.print("]\n");
    }
    public static void main(String ...args){
//        String s1 = "Ganesh";
//        char c[] = s1.toCharArray();
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
//        String s2 = new String(c);
//        System.out.println(s2);
//        //
//        String s3 = null;
//        try {
//            s3 = s2.substring(2,4); //this block can throw multiple exceptions
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            //clean up task
//            System.out.println(e);
//        }finally{
//            //clean up resources
//            System.out.println("finally");
//        }
//        // endIndex excluding last char
//        System.out.println(s3);
//        System.out.println("TESTSTSTST");
//
//        AA a = new AA();
//        System.out.println(a);
//        a = null; //this is marked to garbage collections

        String ss = "Ganesh"; //literal pool
        String s1 = new String("Ganesh");

        System.out.println(ss.equals(s1));
//        for(int i=0;i<ss.length();i++){
//            System.out.println(ss.charAt(i));
//        }

        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String []a = new String[10];
        for(int i=0;i<10;i++) {
            String s = "";
            Random r = new Random();
            for(int j=0;j<10;j++) {
                s += abc.charAt(r.nextInt(62-1) + 0);
            }
            a[i] = s;
        }
        printArray(a);
    }
}

//java garbage collector
//garbage collector --> after each 1 min it runs garbage
//assign objects to null
