import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String s = c.next();
		int upper = 0;
		int lower = 0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper = upper + 1;
			}
			else if(ch >='a' && ch<='z')
			{
				lower = lower + 1;
			}
		}
		if(upper > lower)
		{
			System.out.println(s.toUpperCase());
		}
		else
		{
			System.out.println(s.toLowerCase());
		}
	}
}