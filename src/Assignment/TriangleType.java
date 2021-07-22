package Assignment;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b+c && b<a+c && c<a+b)
        {
            if(a==b && b==c)
            	System.out.println("Equilateral triangle");
            else if(a==b || b==c || c==a)
            	System.out.println("Isosoceles triangle");
            else
            	System.out.println("Scalene triangle");
        }
        else
        	System.out.println("Can't form a triangle");
    }

	}


