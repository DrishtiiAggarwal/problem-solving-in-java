import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();

       int max = a;
       if (b >= max)
             max = b;

       if (c >= max)
            max = c;

       if (max == a) {
         System.out.println((b * b + c * c) == (a * a));
    }  else if (max == b) {
         System.out.println((a * a + c * c) == (b * b));
    }  else {
         System.out.println((a * a + b * b) == (c * c));
    }
    }
}