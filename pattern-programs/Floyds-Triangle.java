import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int i, j, k = 1;
        for (i = 1; i <= n; i++){
            for (j = 1; j <= i; j++){
                System.out.print(k + "  ");
                k++;
            }
            System.out.println();
        }
    }
}