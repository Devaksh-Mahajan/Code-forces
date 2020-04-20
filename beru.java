import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double a = c.nextDouble();
		double b = c.nextDouble();
		double n = c.nextDouble();
		double k = 10000000;
		for(int i=0;i<n;i++)
		{
			double x = c.nextDouble();
			double y = c.nextDouble();
			double v = c.nextDouble();
			double ans = (Math.sqrt((x-a)*(x-a) + (y-b)*(y-b)))/v;
			if(ans<k)
			{
				k = ans;
			}
		}
		System.out.println((k));

	}
}