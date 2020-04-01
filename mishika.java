import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count=0;
		int count1=0;
		for(int i=0;i<t;i++)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m<=n)
			{
				count1 = count1 + 1;
			}
			if(m>=n)
			{
				count = count + 1;
			}
		}
		if(count>count1)
		{
			System.out.println("Mishka");
		}
		if(count==count1)
		{
			System.out.println("Friendship is magic!^^");
		}
		if(count<count1)
		{
			System.out.println("Chris");
		}
	}
 
}