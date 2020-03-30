import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int k = sc.nextInt();
			int x;    // pen
			int y;    // pencil
			x = a/c;
			y = b/d;
			if(x*c<a)
			{
				x = x+1;
			}
			if(y*d<b)
			{
				y = y+1;
			}
			if(x+y<=k)
			{
				System.out.println(x + " " + y);
			}
			else{
				System.out.println("-1");
			}		
		}
	}
}