import java.util.*;


public class ForLoopBasics {
    private static void forLoop(int n) {
        for (int i = 1; i < n; i++) {
            if( i % 2 == 0) { //even numbers will be skipped
                continue;
            }else if ( i>=8 ){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Ganesh Ended");
        int i= 100;
    }//1 2 3 4 ...n

    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        forLoop(n);
    }
}
