import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		for(int i=0;i<n;i++)
		{
			String k = c.next();
			int l = k.length();
			if(k.charAt(l-1)=='o')
			{
				System.out.println("FILIPINO");
			}
			if(k.charAt(l-1)=='u')
			{
				System.out.println("JAPANESE");
			}
			if(k.charAt(l-1)=='a')
			{
				System.out.println("KOREAN");
			}
		}
		
	
}
}
