import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int ans = 0;
		for(int i=0;i<n;i++)
		{
			String k = c.next();
			int l = k.length();
			if(k.charAt(0)=='I')
			{
				ans = ans + 20;	
			}
			else if(k.charAt(0)=='C')
			{
				ans = ans + 6;
			}
			else if(k.charAt(0)=='T')
			{
				ans = ans + 4;
			}
			else if(k.charAt(0)=='O')
			{
				ans = ans + 8;
			}
			else if(k.charAt(0)=='D')
			{
				ans = ans + 12;
					
			}
		}
		System.out.println(ans);
	}
}