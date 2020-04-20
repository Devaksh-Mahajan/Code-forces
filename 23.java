import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int m = c.nextInt();
		int re = -1;
		if(n==m)
		{
			System.out.println("0");
		}
		else if(m%n!=0)
		{
			System.out.println("-1");
		}
		else if(m%n==0)
		{
			re = 0;
			int d = m/n;
			while(d%2==0)
			{
				d = d/2;
				re  =re+1;
			}
			while(d%3==0)
			{
				d = d/3;
				re = re+1;
			}
			if(d!=1)
			{
				re  =-1;
			}
			System.out.println(re);
		}
	}
}