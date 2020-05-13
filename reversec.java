import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String s = c.next();
		String k = c.next();
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		String l = str.toString();
		if(l.equals(k))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
}