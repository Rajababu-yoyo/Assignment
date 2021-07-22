package Assignment;

import java.util.Scanner;

public class PerimeterCircleRectanglaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double peri = Math.PI*r*2;
		System.out.println(peri);
		int l = sc.nextInt();
		int br = sc.nextInt();
		double peri1 = (2*(l+br));
		System.out.println(peri1);;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double peri2 = a+b+c;
		System.out.println(peri2);

	}

}
