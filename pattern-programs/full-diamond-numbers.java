import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n - i; j++) { 
                System.out.print(" "); } 
                for (int k = i; k >= 1; k--){
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++){ 
                System.out.print(l); }
                 System.out.println(); }
                  for (int i = 3; i >= 1; i--){
                   n = 3;
   
                for (int j = 0; j<= n - i; j++) {
                 System.out.print(" "); }
                  for (int k = i; k >= 1; k--){
                 System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
   
            System.out.println();
        }
    }}