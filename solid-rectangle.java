import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        for( int i = 1; i <= r; i++)
		{
			for(int j = 1; j <= c; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
    }
}