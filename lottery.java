import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int count = 0;
		if(n>=100)
		{
			count = count + n/100;
			n = n%100;
		}
		if(n>=20)
		{
			count = count + n/20;
			n = n%20;
		}
		if(n>=10)
		{
			count = count + n/10;
			n = n%10;
		}
		if(n>=5)
		{
			count = count + n/5;
			n = n%5;
		}
		if(n>=1)
		{
			count = count + n;
		}
		System.out.println(count);
	}
}