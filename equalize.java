import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int q = c.nextInt();
		for(int i=0;i<q;i++)
		{
			int n = c.nextInt();
			int sum = 0;
			int[] arr = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = c.nextInt();
				sum = sum + arr[j];
			}
			System.out.println((sum+n-1)/n);
		}
	}
}