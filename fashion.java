import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = c.nextInt();
			if(n%4==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}