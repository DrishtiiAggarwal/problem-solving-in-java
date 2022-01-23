import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        int f = df(n,b);
        System.out.println(f);     
    }
    public static int df(int n , int b){
        int rv = 0 ;
        int p = 1;

        while(n>0){
            int dig = n%10;
            n=n/10;

            rv += dig*p;
            p = p *b;
        }
        return rv;
    }
}