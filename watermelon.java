import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int w = c.nextInt();
		if(w==2)
		{
			System.out.println("NO");
		}
		else if(w%2==0)
		{
			System.out.println("YES");
		}
		else if(w%2!=0)
		{
			System.out.println("NO");
		}
	}
}