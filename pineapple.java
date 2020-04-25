import java.util.*; // logic is correct but it is exceeding the time limit
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		long t = c.nextLong();
		long s = c.nextLong();
		long x = c.nextLong();
		long count=0;
		long count1 = 0;
		long count2 = 0;
		long count3 = 0;
		long ans = t;
		for(int i=1;i<=s;i++)
		{
			long ans2 = (t+i*s);
			long ans3 = t+(i*s)+1;
			if(ans==x)
			{
				count = count + 1;
			}
			else if(ans2==x)
			{
				count1 = count1 +1;
			}
			else if(ans3==x)
			{
				count2 = count2 +1;
			}
			else if(ans!=x && ans2!=x && ans3!=x)
			{
				count3 = count3 + 1;
			}
		}
		if(count>0)
		{
			System.out.println("YES");
		}
		else if(count1>0)
		{
			System.out.println("YES");
		}
		else if(count2>0)
		{
			System.out.println("YES");
		}
		else if(count3>0)
		{
			System.out.println("NO");
		}
	}
}