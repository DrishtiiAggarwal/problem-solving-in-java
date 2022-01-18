import java.util.Scanner;      
public class Main {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = n; i > 0; i-- ){
			for (int j = 1 ; j <= i; j++ ){
				if(j == 1 || j == i || i == 1 || i == n){
					System.out.print(j +" ");}
				else {
					System.out.print(" ");}
			}
			System.out.println();
		}
    }
}