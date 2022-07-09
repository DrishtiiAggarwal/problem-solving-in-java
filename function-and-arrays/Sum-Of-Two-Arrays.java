import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int n1 =  scn.nextInt();
    int[] a1 = new int[]{ 3, 1, 0, 7, 5 };
    int n2 = scn.nextInt();
    int[] a2 = new int[]{ 1, 1, 1, 1, 1, 1 };

    int[] sum = new int[n1 > n2 ? n1 : n2];
    int i = n1 - 1;
    int j = n2 - 1;
    int k = sum.length - 1;
    int c = 0;
    while (i >= 0 || j >= 0) {
      int d = c;

      if (i >= 0)
        d += a1[i];

      if (j >= 0)
        d += a2[j];

      c = d / 10;
      d = d % 10;
      sum[k] = d;

      i--;
      j--;
      k--;
    }

    if (c > 0) {
      System.out.println(c);
    }
    for (int val : sum) {
      System.out.println(val);
    }
  }

}