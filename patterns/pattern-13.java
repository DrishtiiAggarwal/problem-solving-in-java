import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int b = 1;
            for (int j = 0; j <= i; j++) {
           System.out.print( b +"\t" );
           int c = b * (i - j) / (j + 1);
           b = c;
             }
        System.out.println();
      }
    }
}