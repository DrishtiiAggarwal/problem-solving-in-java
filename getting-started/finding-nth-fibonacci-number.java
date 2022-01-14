import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       int p = 0;
       int i = 1;
       int count = 2;

       while(count <= n){
           int det = i;
           i = i + p;
           p = det;
           count++;
       }
       System.out.println(i);

    }
}