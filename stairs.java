import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int x = c.nextInt(); // floor present
		int y = c.nextInt(); //floor she wants to go
		int z = c.nextInt();// floor the elevator is located
		int t1 = c.nextInt(); // time taken by stairs
		int t2 = c.nextInt();// time it takes by elevtor
		int t3 = c.nextInt();// time for closing an opening of door
		int stairs = (Math.abs((x-y)))*t1; // time taken by stairs
		int e = (Math.abs(z-x))*t2 + (Math.abs(x-y))*t2 + 3*t3;
		if(e<=stairs)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}