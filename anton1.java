import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		int n = sc.nextInt();
		String k = sc.next();
		for(int i=0;i<n;i++)
		{
			if(k.charAt(i)=='A')
			{
				count = count +1;
			}
			else if(k.charAt(i)=='D')
			{
				count1 = count1 +1;
			}
		}
		if(count<count1)
		{
			System.out.println("Danik");
		}
		else if(count == count1)
		{
			System.out.println("Friendship");
		}
		else if(count1 < count)
		{
			System.out.println("Anton");
		}
	}
}