import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = c.nextInt();
		}
		Arrays.sort(arr);
		int ans = arr[(n-1)/2];
		System.out.println(ans);
	}
}