import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();

       while(a > 0){
           int d = a %10;
           a= a /10;
           System.out.println(d);
       }

       
    }
}