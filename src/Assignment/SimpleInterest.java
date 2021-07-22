package Assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		double simpleinterest = ((p*t*r)/100);
		System.out.println(simpleinterest);

	}

}
