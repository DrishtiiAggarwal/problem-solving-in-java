import java.util.Scanner;      
public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i,j,k;
        for (i = 1 ; i <= n; i++ ){
            for (j = 1 ; j <= n - i; j++ ){
				System.out.print(" ");
			}
			for (k = 1; k <= (i * 2) - 1; k++ ){
				if(k == 1 || k == i * 2 - 1 || i == n){
					System.out.print( i +" ");
				}	
				else {
					System.out.print(" ");
				}
			}		
			System.out.println();
		}
    }
}