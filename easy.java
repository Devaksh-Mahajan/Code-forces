import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int[] arr = new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			arr[i] = c.nextInt();
		}
		for (int i=0;i<n;i++ ) {
			if(arr[i]==1)
			{
				k=1;
				break;
			}

		}
		if(k==1)
		{
			System.out.println("HARD");
		}
		else
		{
			System.out.println("EASY");
		}


	}
}
