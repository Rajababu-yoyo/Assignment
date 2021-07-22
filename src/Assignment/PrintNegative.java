package Assignment;

import java.util.Scanner;

public class PrintNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<0){
			System.out.println(i);
		}
		else {
			System.out.println("Entered number is positive.");
		}

	}

}
