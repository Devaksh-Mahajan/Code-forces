import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		int ans = 1440;
		int ans1;
		for(int i=0;i<t;i++)
		{
			int h = c.nextInt();
			int m = c.nextInt();
			ans1 = ans - (h*60 + m);
			System.out.println(ans1);
		}
	}
}