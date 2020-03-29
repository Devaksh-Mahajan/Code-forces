import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int k = c.nextInt();
		int ans = 1440-k;
		int l;
		int sum = 0;
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			 sum = sum + 5*i;
			 l = 1200+sum;
			 if(l<=ans)
			 {
			 	count = count + 1;
			 }
		}
		System.out.println(count);
	}
}