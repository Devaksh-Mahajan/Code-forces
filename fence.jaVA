import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int count1 = 0;
		int ans;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(h>=arr[i])
			{
				count = count + 1;
			}
			else if(h<arr[i])
			{
				count1 = count1 + 2;
			}
		}
		ans = count + count1;
		System.out.println(ans);
	}
}