import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i,j;
        for(i=1;i<=row;i++){
            for(j=i;j<=row;j++){
                 System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                 System.out.print(j+"");
            }
            for(j=i-1;j>=1;j--){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}