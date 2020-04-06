import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int l = n%10;
		if(l<=5)
		{
			System.out.println(n-l);
		}
		else if(l==6)
		{
			System.out.println(n+4);
		}
		else if(l==7)
		{
			System.out.println(n+3);
		}
		else if(l==8)
		{
			System.out.println(n+2);
		}
		else if(l==9)
		{
			System.out.println(n+1);
		}
		else if(l==0)
		{
			System.out.println(n);
		}
	}
}