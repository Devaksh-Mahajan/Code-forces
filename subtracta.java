import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int k = c.nextInt();
		for(int i=0;i<k;i++)
		{
			if(n%10==0)
			{
				n = n/10;
			}
			else
			{
				n = n-1;
			}
		}
		System.out.println(n);
	}
}