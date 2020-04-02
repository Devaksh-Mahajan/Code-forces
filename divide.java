import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		{
			long n = sc.nextLong();
			int count=0;
			int count1=0;
			int count3=0;
			while(n%2==0)
			{
				n = n/2;
				count = count +1;		}
			while(n%3==0)
			{
				n=n/3;
				count1 = count1 + 1;
			}
			while(n%5==0)
			{
				n = n/5;
				count3 = count3 + 1;
			}
			if(n!=1)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(count + count1*2 + count3*3);
			}
		}
	}
}