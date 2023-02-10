import java.util.*;

public class ForLoopBasics2 {
    private static void forLoop(int n) {
        for (int i = 1; i < n; i*=2) { //n
            for(int j = 1; j <= i; j++ ) { //i
                for(int k = 1;k <= j ; k++)
                    System.out.print(k + " ");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Ganesh Ended");
        int i= 100;
    }//1 2 3 4 ...n     O(nlogn)

    private static void forLoopStar(int n) {
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }

    }//1 2 3 4 ...n     O(nlogn)

    public static void main(String... args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        forLoop(n);
        forLoopStar(100);
    }
}
