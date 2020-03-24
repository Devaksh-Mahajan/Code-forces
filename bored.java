import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		int b = c.nextInt();
		int fac1 = 1;
		int fac2 = 1;
		for(int i=1;i<=a;i++)
		{
			fac1 = fac1 * i;
		}
		for(int j=1;j<=b;j++)
		{
			fac2 = fac2 * j;
		}
		if(a>b)
		{
			System.out.println(fac2);
		}
		else
		{
			System.out.println(fac1);
		}
	}
}