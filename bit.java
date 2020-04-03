import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c=  new Scanner(System.in);
		int n = c.nextInt();
		int count = 0;
		int count1 = 0;
		for(int i=0;i<n;i++)
		{
			String s = c.next();
			for(int j=0;j<s.length();j = j+2)
			{
				if(s.charAt(j)=='+')
			{
				count = count + 1;
			}
				if(s.charAt(j)=='-')
				{
					count1 = count1 -1;
				}
			}

		}
		System.out.println(count + count1);
	}
}