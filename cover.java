import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int sum = 0;
		int z = -1;
		for(int i=0;i<n;i++)
		{
			int x = c.nextInt();
			int y = c.nextInt();
			sum = x+y;
			z = Math.max(z, sum);
		}
		System.out.println(z);
	}
}