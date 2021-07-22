package Assignment;

import java.util.Scanner;

public class RelationBetNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b) {
			System.out.println("is less than");
		}
		else if(a>b)
		{
			System.out.println("is greater than");
		}
		else
		{
			System.out.println("are equal");
		}

	}

}
