import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		long n = c.nextLong();
		long m = c.nextLong();
		int l = (int)(Math.pow(2, n));
		long k = m%l;
		System.out.println(k);
	}
}