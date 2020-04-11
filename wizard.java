import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double l = c.nextDouble();
		double p = c.nextDouble();
		double q = c.nextDouble();
		double x = (p*l)/(q+p);
		System.out.println(x);
	}
}