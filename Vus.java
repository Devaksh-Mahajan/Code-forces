import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int m = c.nextInt();
		int k = c.nextInt();
		if(n<=m && n<=k)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}