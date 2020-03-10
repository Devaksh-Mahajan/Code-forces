import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int[] a = new int[n];
		int x = 1;
		int count = 0;
		for(int i=0;i<n;i++)
		{
			a[i] = c.nextInt();
			if(x==a[i])
			{
				count = count +1;  // count number of 1
			}
		}
		System.out.println(count);
		for(int i=1;i<n;i++)
		{
			if(a[i]==x) // check for the number before 1 occurence
			{
				System.out.print(a[i-1] + " ");
			}
		}
		System.out.print(a[n-1]); //last elemnt
	}
}