import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


class NotAllowedException extends Exception {
    public NotAllowedException(String message){
        super(message);

    }
}
public class InputHandling {
    public static void method(int number) throws Exception{
        System.out.println("Test Method called");
        if(number <= 18){
            throw new NotAllowedException("Age less than 18 not allowed");
        }
        //logic
        System.out.println("Received number:" + number);
    }

    public static void main(String... args) throws Exception{
        Scanner s = new Scanner(System.in);
        int i = 0;
        method(10);
        try {
            FileReader reader = new FileReader("/Users/ganeshkulkarni/Downloads/a.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Unknown Exception");
        }
        try {
            File file = new File("/Users/ganeshkulkarni/Downloads/a.out");
            FileInputStream fr = new FileInputStream(file);
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
