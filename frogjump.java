import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		for(int j=0;j<n;j++)
		{
			long ans =0L;
			long[] arr = new long[3];
			for(int i=0;i<3;i++)
			{
				arr[i] = c.nextInt();
			}
			long x;
			x = arr[2]/2;
			if(arr[2]%2==0)
			{
				
				ans = (long)((x*arr[0])-(x*arr[1]));
			}
			else
			{
				ans = (long)(((x+1)*arr[0])-(x*arr[1]));
			}
			System.out.println(ans);
		}
		
	}
}