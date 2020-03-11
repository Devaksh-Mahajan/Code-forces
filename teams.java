import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			arr[i] = c.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		*/
		int x=0;
		for(int i=0;i<n;i=i+2)
		{
			if(arr[i]<arr[i+1])
			{
				x = x + arr[i+1]-arr[i];
			}
		}
		System.out.print(x);
		
	}
}
