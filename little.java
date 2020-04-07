import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n-2)%3!=0)
		{
			System.out.print("1 1 ");
			System.out.print(n-2);
		}
		else
		{
			System.out.print("1 2 ");
			System.out.print(n-3);
		}
	}
}