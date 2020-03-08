import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		int b = c.nextInt();
		int count = 0;
		while(a<=b)
		{
			a = a*3;
			b = b*2;
			count = count + 1;
		}
		System.out.println(count);
	}
}