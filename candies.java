import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long ans;
		long ans1=0;
		for(int i=0;i<q;i++)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			ans = (a+b+c)/2;
			System.out.println(ans);
		}
	}
}