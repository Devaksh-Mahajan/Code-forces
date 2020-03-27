import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		long n = c.nextLong();
		long k = c.nextLong();
		long ans = n/k;
		if(ans%2==0)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}