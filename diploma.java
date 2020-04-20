import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long d = ((n/2)/(k+1));
		long c = k*d;
		System.out.print(d + " ");
		System.out.print(c + " ");
		System.out.println(n - (c+d));
	}
}