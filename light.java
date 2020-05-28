import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = c.nextInt();
			int m = c.nextInt();
			System.out.println(((n*m) + 1)/2);
		}
	}
}