import java.util.*;
public class t1Piruk {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args)
	{
		int num,d;
		int i = 0;
		int dBig = -1;
		int bigI = 1;
		num = reader.nextInt();
		while (num != 0)
		{
			d = num%10;
			i++;
			if (d>dBig)
			{
				dBig = d;
				bigI = i;
			}
			num = num/10;
		}
		System.out.println("biggest d: " + dBig);
		System.out.println("at: " + bigI + " From left.");
	}
}