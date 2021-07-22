package Assignment;

import java.util.Scanner;

public class MathFormula3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x= ((-b)+(Math.sqrt(b*b)-(a*c*4)*a*2));
		System.out.println(x);

	}

}
