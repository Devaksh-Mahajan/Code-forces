import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		int b = c.nextInt();
		int ans = Math.abs(a-b);
		int l = ans/2;
		if(a<b)
		{
			System.out.println(a + " " + l);
		}
		else if(a>b)
		{
			System.out.println(b + " " + l);
		}
		else if(a==b)
		{
			System.out.println(a + " 0");
		}
	}
}
			