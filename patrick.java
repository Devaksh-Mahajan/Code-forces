import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int d1 = c.nextInt();
		int d2 = c.nextInt();
		int d3 = c.nextInt();
		int ans = 2*d1 + 2*d2;
		int ans1 = d1 + d2 + d3;
		int ans3 = 2*d2 + 2*d3;
		int ans4 = 2*d1 + 2*d3;
		if(ans<=ans1 && ans<=ans3 && ans<=ans4)
		{
			System.out.println(ans);
		}
		else if(ans1<=ans && ans1<=ans3 && ans1<=ans4)
		{
			System.out.println(ans1);
		}
		else if(ans3<=ans && ans3<=ans1 && ans3<=ans4)
		{
			System.out.println(ans3);
		}
		else if(ans4<=ans && ans4<=ans1 && ans4<=ans3)
		{
			System.out.println(ans4);
		}
		
	}
}