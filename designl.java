import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		if(n%2==0)
		{
			System.out.print("8 ");
			System.out.print(n-8);
		}
		else
		{
			System.out.print("9 ");
			System.out.print(n-9);
		}
	}
}