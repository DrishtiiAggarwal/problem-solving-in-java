import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

        for (int div = 2; div * div <= n; div++) {
           while (n % div == 0){
               System.out.print(div + " ");
               n = n / div;
               }
             }
       if (n != 1){
          System.out.print(n);
       }
    }
}