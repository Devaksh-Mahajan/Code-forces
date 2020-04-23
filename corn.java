import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double n = c.nextDouble();
		double d = c.nextDouble();
		double m = c.nextDouble();
		double area = Math.abs((Math.sqrt(2)*Math.sqrt(2)*(n-d)*(d)));
		for(int i=0;i<m;i++)
		{
			double x = c.nextDouble();
			double y = c.nextDouble();
			double area1 = (Math.abs((-(d*x)+(d*d)-(d*y))))/2;
			double area2 = (Math.abs((x*(d-n) + d*(n-d-y) + n*y)))/2;
			double area3 = (Math.abs(x*(-d) + n*(n-y) + (n-d)*(y+d-n)))/2;
			double area4 = (Math.abs(x*(d-n) + (n-d)*(y-d)))/2;
			if((area1+area2+area3+area4)<=area)
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