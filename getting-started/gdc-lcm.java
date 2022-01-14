import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int temp1 = n1;
        int temp2 = n2;

        while (n1 % n2 != 0)
           {
             int remainder = n1 % n2;
              n1 = n2;
              n2 = remainder;
            }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
       
    }
}