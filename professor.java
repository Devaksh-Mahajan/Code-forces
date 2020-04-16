import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int x1 = c.nextInt();
		int y1 = c.nextInt();
		int x2 = c.nextInt();
		int y2 = c.nextInt();
		int ans = Math.abs(x2-x1);
		int ans1 = Math.abs(y2-y1);
		int k;
		if(ans == ans1)
		{
			System.out.println(ans);
		}
		else
		{
			if(ans<ans1)
			{
				k = ans1 - ans;
				System.out.println(ans+k);
			}
			else
			{
				k = ans-ans1;
				System.out.println(ans1 + k);
			}
		}
	}
}