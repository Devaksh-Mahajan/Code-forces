import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		int count = 0;
		for(int i=0;i<t;i++)
		{
			long x = c.nextLong();
			long y = c.nextLong();
			long n = c.nextLong();
			long q = (n-y)/x;
			long k = (x*q)+y;
			System.out.println(k);
		}

	}
}