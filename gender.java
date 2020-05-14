import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = new String();
		int length = s.length();
		for(int i=0;i<length;i++)
		{
			char c = s.charAt(i);
			if(str.indexOf(c)<0)           // removed duplicates
			{
				str = str + c;
			}
		}
		int count = 0;
		int length1 = str.length();
		for(int j=0;j<length1;j++)
		{
			count = count +1;
		}
		if(count%2==0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
		{
			System.out.println("IGNORE HIM!");
		}
	}
}