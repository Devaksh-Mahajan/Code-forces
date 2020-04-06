import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int m = c.nextInt();
		int z = c.nextInt();
		int gcd = 1;
		for(int i=1;i<=n && i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			{
				gcd = i;
			}
		}
		int lcm = (n*m)/gcd;
		System.out.println(z/lcm);
	}
}