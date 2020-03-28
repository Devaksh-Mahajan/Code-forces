import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int count = 0;
		int count1 = 0;
		for(int i = 0;i<n;i++)
		{
			int p = c.nextInt();
			int q = c.nextInt();
			
			if(q-p>1)
			{
				count = count + 1;
			}
			
		}
		System.out.println(count);
	}
}