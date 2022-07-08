import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        int t = 1;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
           System.out.print( m +"\t" );
           int x = m +t;
           m = t;
           t = x;
             }
        System.out.println();
      }
    }
}