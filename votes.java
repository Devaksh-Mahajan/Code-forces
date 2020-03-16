import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		int y = c.nextInt();
		int z = c.nextInt();
		if(z==0 && x==y)
		{
			System.out.println("0");
		}
		
		else if(x > y+z)
		{
			System.out.println("+");
		}
		else if(y > x+z)
		{
			System.out.println("-");
		}
		else
		{
			System.out.println("?");
		}
	}
}
