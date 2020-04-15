import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		long n = c.nextLong();
		long ans = n/2;
		long k = n-ans;
		long tt = -(k*k)+2*((ans*(ans+1))/2);
		System.out.println(tt);
	}
}