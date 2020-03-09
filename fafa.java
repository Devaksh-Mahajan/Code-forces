import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int count = 1;
		for(int i=2;i<=n/2;i++)
		{
			if(((n-i)%i) == 0)
			{
				count  = count + 1;
			}
		}
				System.out.print(count);
	}
	
}