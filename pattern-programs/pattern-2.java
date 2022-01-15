import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int nstars = n;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= nstars; j++) {
              System.out.print("*\t");
             }
           nstars--;
           System.out.println();
      }
    }
}