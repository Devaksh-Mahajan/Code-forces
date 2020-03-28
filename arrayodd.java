import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		for(int i=0;i<t;i++)
		{
			int sum = 0;
			int even = 0;
			int odd = 0;
			int n = c.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = c.nextInt();
				sum = sum + arr[j];
				if(arr[j]%2==0)
				{
					even = even + 1;
				}
				else
				{
					odd = odd + 1;
				}
			}
				if(sum%2!=0 || even>0 && odd>0)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
		}
	}
}