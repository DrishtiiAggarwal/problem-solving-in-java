import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       int d = 0;
       
       while(n != 0){
           n = n/10;
           d++;
       }
       System.out.println(d);
    }
}