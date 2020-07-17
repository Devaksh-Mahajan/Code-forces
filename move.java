import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		for(int i=0;i<t;i++)
		{
			int a = c.nextInt();
			int balance = 0;
			int count = 0;
			String k = c.next();
			for(int j=0;j<a;j++)
			{
				if(k.charAt(j)=='(')
				{
					balance = balance + 1;
				}
				else if(k.charAt(j)==')')
				{
					balance = balance - 1;
					if(balance < 0)
					{
						balance = 0;
						count = count + 1;
					}
				}
			}
			System.out.println(count);

		}
	}
}