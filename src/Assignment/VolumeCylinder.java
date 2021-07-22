package Assignment;

import java.util.Scanner;

public class VolumeCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int l = sc.nextInt();
		double volume = Math.PI*r*r*l;
		System.out.println(volume);

	}

}
