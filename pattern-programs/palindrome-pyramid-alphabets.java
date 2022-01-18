import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i,j,k;
        for(i=1;i<=row;i++){
            for(j=i;j<=row;j++){
                 System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                 System.out.print((char)(j+64)+"");
            }
            for(k=i-1;k>=1;k--){
                System.out.print((char)(k+64)+"");
            }
            System.out.println();
        }
    }
}