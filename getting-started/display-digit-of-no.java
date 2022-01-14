import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();

       int n = 0;
       int temp = num;
       while(temp != 0){
           temp = temp/10;
           n++;
       }

       int div = (int)Math.pow(10, n -1);
       while( div != 0){
           int q= num/div;
           System.out.println(q);

           num = num % div;
           div = div/10;
       }
    }
}