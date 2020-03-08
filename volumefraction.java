import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		double[] p = new double[n];
		double sum = 0;
		double average=0;
		for(int i=0;i<n;i++)
		{
			p[i] = c.nextDouble();
			sum = sum + p[i];
			average = sum/n;

		}
		System.out.println(average);

	}
}