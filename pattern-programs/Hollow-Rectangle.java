import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
		int columns = in.nextInt();
		for (int i = 0; i < rows; i++ ) 
		{
			for (int j = 0 ; j < columns; j++ ) 
			{
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
