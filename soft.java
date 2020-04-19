import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		int nl = sc.nextInt();
		int np = sc.nextInt();
		int a = k*l;
		int ans = (a/nl)/n;
		int ans1 = (c*d)/n;
		int ans2 = (p/np)/n;
		if(ans<=ans1 && ans<=ans2)
		{
			System.out.println(ans);
		}
		else if(ans1<=ans && ans1<=ans2)
		{
			System.out.println(ans1);
		}
		else if(ans2<=ans && ans2<=ans1)
		{
			System.out.println(ans2);
		}
	}
}