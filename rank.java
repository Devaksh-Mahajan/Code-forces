import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sum = a+b+c+d;
		int count=1;
		for(int i=2;i<=n;i++)
		{
			 a = sc.nextInt();
			 b = sc.nextInt();
			 c = sc.nextInt();
			 d = sc.nextInt();
			if((a+b+c+d)>sum)
			{
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}