import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int i,k,l;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();  
        for(i=1;i<=n;i++){
            for(k=1;k<=i;k++){
                 System.out.print("*");
            }
         System.out.println("");
        }
        
    for(i=n;i>1;i--){
        for(k=i;k>1;k--){
             System.out.print("*");
            }
         System.out.println("");
        }
    }
}