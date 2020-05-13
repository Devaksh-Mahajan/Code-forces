import java.util.*;
public class main
{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		String s = c.next();
		String k = s.substring(0,1).toUpperCase() + s.substring(1);
		System.out.println(k);
	}
}