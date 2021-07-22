package Assignment;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a<b)&&(b<c))
		{
			System.out.println(c+" is greatest");
		}
		else if((a<c)&&(c<b))
		{
			System.out.println(b+" is greatest");
		}
		else
		{
			System.out.println(a+" is greatest");
		}

	}

}
