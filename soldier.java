import java.util.*;
import java.lang.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int k = c.nextInt();
		int n = c.nextInt();
		int w = c.nextInt();
		int ans = 0;
		ans = ans + k*(w*(w+1))/2;
		if(ans-n<0)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println((ans-n));
		}
		
		}
		
	}
