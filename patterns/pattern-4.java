import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i, j;
        for(i=1;i<=n;i++){
         for(j=1;j<i;j++){
             System.out.print(" ");
         }
         for(j=i;j<=n;j++){
             System.out.print("*");
         }
         System.out.println("");
     } 
}
}