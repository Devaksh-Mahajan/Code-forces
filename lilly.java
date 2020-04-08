import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c=  new Scanner(System.in);
		double h = c.nextDouble();
		double l = c.nextDouble();
		double ans = (l*l - h*h);
		double ans1 = 2*h;
		double x = ans/ans1;
		System.out.println(x);
	}
}