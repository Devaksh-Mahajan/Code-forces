import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int[] arr = new int[4];
		int d = 0;
		for(int i=0;i<4;i++)
		{
			arr[i] = c.nextInt();
		}
		Arrays.sort(arr);
		//System.out.println("" + Arrays.toString(arr));
		for(int i=0;i<4;i++)
		{
			if(arr[i]>d)
			{
				d = arr[i];
			}
		}
		//System.out.println(d);
		for(int i=0;i<3;i++)
		{
			System.out.println(d-arr[i]);
		}
		

	}
}