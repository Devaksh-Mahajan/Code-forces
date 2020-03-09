import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int s = c.nextInt();
		int v1 = c.nextInt();
		int v2 = c.nextInt();
		int t1 = c.nextInt();
		int t2 = c.nextInt();
		int first = t1 +s*v1 + t1;
		int second = t2 +s*v2 + t2;
			if(first<second)
		{
			System.out.println("First");
		}
		else if(first>second)
		{
			System.out.println("Second");
		}
		else
		{
			System.out.println("Friendship");
		}
		}

	}