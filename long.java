import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = c.next();
			int l = s.length()-2;
			int ans = (l)+1;
			if(s.length()>10)
			{
				System.out.print(s.charAt(0));
				System.out.print(l);
				System.out.println(s.charAt(s.length()-1));
			}
			else
			{
				System.out.println(s);
			}
		}
	}
}
