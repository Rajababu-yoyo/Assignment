package Assignment;

import java.util.Scanner;

public class MathFormula1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double u = sc.nextDouble();
		double t = sc.nextDouble();
		double a = sc.nextDouble();
		double s = ((u*t)+(a*t*t*1/2));
		System.out.println(s);

	}

}
