import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int vii = 1;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
           System.out.print(vii );
           vii++;
             }
        System.out.println();
      }
    }
}