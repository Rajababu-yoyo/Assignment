package Assignment;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double s1 = ((a+b+c)/2);
		double area2 = Math.sqrt(s1*(s1-a)*(s1-b)*(s1-c));
		System.out.println(area2);
	

	}

}
