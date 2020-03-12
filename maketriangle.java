import java.util.*;
import java.lang.Math;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[3];
		double s;
		int count = 0;
		for(int i=0;i<3;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		s = (arr[0] + arr[1] + arr[2])/2;
		//System.out.println(s);
		double l = s*(s-arr[0])*(s-arr[1])*(s-arr[2]);
		double k = l; // area
		//System.out.println(k);
		if(k>0)
		{
			System.out.println("0");
		}
		else if(k<0 || k==0)
		{
			while(k<=0)
			{
				count = count+1;
				if(arr[0]<arr[1])
				{
					arr[0] = arr[0]+1;
				}
				else
				{
					arr[1]++;
				}
				s = (arr[0]+arr[1]+arr[2])/2;
				l = s*(s-arr[0])*(s-arr[1])*(s-arr[2]);
				k = l;
			}
			System.out.println(count);
		}
	}
}