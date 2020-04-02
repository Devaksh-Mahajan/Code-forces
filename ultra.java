import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String n = c.next();
		String n1 = c.next();
		for(int i=0;i<n.length();i++)
		{
				if(n.charAt(i)==n1.charAt(i))
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
		}
	}
}