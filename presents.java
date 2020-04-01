import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = c.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			brr[arr[i]-1] = i+1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(brr[i] + " ");
		}
	}
}