import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int t = c.nextInt();
		for(int i=0;i<t;i++)
		{
			int[] arr = new int[3];
			for(int j=0;j<3;j++)
			{
				arr[j] = c.nextInt();
			}
			Arrays.sort(arr);
				if(arr[2]<= arr[0] + arr[1] + 1)
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}
		}
	}
}