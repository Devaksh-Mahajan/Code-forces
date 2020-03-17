import java.util.*;
import java.lang.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans;
		int k;
		int j;
		int ans1;
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(x==0)
			{
				System.out.println(Math.abs(a-b));
			}
			else if(a>b)
			{
				ans1 = n-a;
				a = a+ans1;
				x = x-ans1;
				if(x>=b)
				{
					System.out.println(Math.abs(a-1));
				}
				else
				{
					System.out.println(Math.abs(a+x-b));				}
			}
			else if(b>a)
			{
				ans1 = n-b;
				b = b+ans1;
				x = x-ans1;
				if(x>=a)
				{
					System.out.println(Math.abs(b-1));
				}
				else
				{
					System.out.println(Math.abs(b+x-a));
				}			
			}
			else if(x==100)
			{
				System.out.println(Math.abs(a-b));
			}
			else if(a==100 && b==1)
			{
				System.out.println(Math.abs(a-b));
			}
			else if(b==1 && a==100)
			{
				System.out.println(Math.abs(a-b));
			}
			else if(n==100)
			{
				if(a<b)
				{
					ans = x+b;
					if(ans==n)
					{
						k = ans - a;
						System.out.println(Math.abs(k));
					}
					else
					{
						j = ans-a;
						System.out.println(Math.abs(j));
					}
				}
				else if(a>b)
				{
					ans = x+a;
					if(ans==n)
					{
						k = ans-b;
						System.out.println(Math.abs(k));
					}
					else
					{
						j = ans-b;
						System.out.println(Math.abs(j));
					}
				}
			}

		}

	}
}