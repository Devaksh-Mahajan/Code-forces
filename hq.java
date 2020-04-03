import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String s = c.next();
		int count  =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9')
			{
				count = count+1;
			}
		}
		if(count>=1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
