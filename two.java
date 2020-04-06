import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int q = c.nextInt();
		for(int i=0;i<q;i++)
		{
			int l1 = c.nextInt();
			int r1 = c.nextInt();
			int l2 = c.nextInt();
			int r2 = c.nextInt();
			if(l1==r1)
			{
				System.out.println(l2 + " " + r2);
			}
			else if(l1==l2 && r1==r2)
			{
				System.out.println(l1 + " " + r2);
			}
			else if(l1==r2)
			{
				System.out.println(r1 + " " + l2);
			}
			else if(r1==l1)
			{
				System.out.println(l2 + " " + r2);
			}
			else if(r1==l2)
			{
				System.out.println(l1 + " " + r2);
			}
			else if(l2==r2)
			{
				System.out.println(l1 + " " + r1);
			}
			else if(l1!=r1 || r1!=l2 || l2!=r2 || r2!=l1)
			{
				System.out.println(r1 + " " + l2);
			}
		}
	}
}