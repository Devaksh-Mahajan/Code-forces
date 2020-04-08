import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int a = (int)Math.sqrt((s1*s3)/s2);
		int b = (int)Math.sqrt((s2*s1)/s3);
		int c = (int)Math.sqrt((s2*s3)/s1);
		int l = 4*(a+b+c);
		System.out.println(l);
	}
}