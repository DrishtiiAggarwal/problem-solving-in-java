import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();  
        int i , j;
        //the upper half
        for(i=1;i<=n;i++){
            for (j = 1; j <= (2 * n); j++){
                if (i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                if (i <= ((2 * n) - j)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        //the lower half
        for (i = 1; i <= n; i++){
            for (j = 1; j <= (2 * n); j++) {
                if (i > (n - j + 1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                if ((i + n) > j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
             System.out.println(" ");
        }

    }
}