import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int ans = 0;
		if(n==1)
		{
			System.out.println("1");
		}
		else if(n>=2)
		{
			System.out.println(2*n*n - 2*n+1);
		}
	}
}