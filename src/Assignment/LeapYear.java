package Assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n%4==0) && (n%100!=0))
	    {
			System.out.println("this is a leap year");
	    }
	    else if(n%100==0)
	    {
	        System.out.println("this is not a leap year");
	    }
	    else if(n%400==0)
	    {
	    	System.out.println("this is a leap year");
	    }
	    else
	    {
	        System.out.println("this is not a leap year");
	}
	}
	}

