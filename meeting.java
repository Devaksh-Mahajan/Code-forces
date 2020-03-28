import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a1 = sc.nextInt();
	int a2 = sc.nextInt();
	int a3 = sc.nextInt();
	int d = Math.abs(a1-a2);
	int b = Math.abs(a2-a3);
	int c = Math.abs(a3-a1);
	if(d==b && b==c && c==d)
	{
		System.out.println(d);
	}
	else if(d>b && d>c && b==c)
	{
		System.out.println(d);
	}
	else if(c>d && c>b && d==b)
	{
		System.out.println(c);
	}
	else if(b>c && b>d && c==d)
	{
		System.out.println(b);
	}
	else if(d>b && d>c)
	{
		System.out.println(d);
	}
	else if(b>d && b>c)
	{
		System.out.println(b);
	}
	else if(c>d && c>b)
	{
		System.out.println(c);
	}
	}
	
}