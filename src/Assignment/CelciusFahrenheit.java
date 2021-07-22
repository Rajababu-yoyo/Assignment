package Assignment;

import java.util.Scanner;

public class CelciusFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double f2c = ((f-32)* 5/9);
		System.out.println(f2c);;
		double c = sc.nextDouble();
		double c2f = ((c*9/5)+32);
		System.out.println(c2f);
		

	}

}
