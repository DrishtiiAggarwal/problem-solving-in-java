import java.util.Scanner;      
public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = n ; i > 0; i-- ){
			for(int j = 1 ; j <= n - i; j++ ){
				System.out.print(" ");
			}
			for(int k = 1 ; k <= (2 * i) - 1; k++ ){
				if(i == 1 || i == n || k == 1 || k == (2 * i) - 1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}