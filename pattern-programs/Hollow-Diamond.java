import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int i,k,j;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();  
        for (i = 1 ; i <= rows; i++ ){
			for (j = 1 ; j <= rows - i; j++ ){
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ){
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ){
			for (j = 1 ; j <= rows - i; j++ ){
				System.out.print(" ");
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ){
				if (k == 1 || k == i * 2 - 1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

    }
}