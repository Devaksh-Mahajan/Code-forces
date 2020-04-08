import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		for(int i=0;i<n;i++)
		{
			int a = c.nextInt();
			if(360%Math.abs(180-a)==0)
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