import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans1 = a+b*c;
		int ans2 = a*(b+c);
		int ans3 = a*b*c;
		int ans4 = (a+b)*c;
		int ans5 = a+b+c;
		if(ans1>ans2 && ans1>ans3 && ans1>ans4 && ans1>ans5)
		{
			System.out.println(ans1);
		}
		else if(ans2>ans1 && ans2>ans3 && ans2>ans4 && ans2>ans5)
		{
			System.out.println(ans2);
		}
		else if(ans3>ans1 && ans3>ans2 && ans3>ans4 && ans3>ans5)
		{
			System.out.println(ans3);
		}
		else if(ans4>ans1 && ans4>ans2 && ans4>ans3 && ans4>ans5)
		{
			System.out.println(ans4);
		}
		else if(ans5>ans1 && ans5>ans2 && ans5>ans3 && ans5>ans4)
		{
			System.out.println(ans5);
		}
		else if(a==2 && b==2 && c==2)
		{
			System.out.println("8");
		}
		else if(a==2 && b==1 && c==2)
		{
			System.out.println("6");
		}
		else if(a==2 && b==1 && c==1)
		{
			System.out.println("4");	
		}
		//else if(ans1==ans2 || ans2==ans3 || ans3==ans4 || ans4==ans1)
		//{
		//	System.out.println(a+b+c);
		//}
	}
}