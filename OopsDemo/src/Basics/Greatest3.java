package Basics;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 3 inputs :");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		scan.close();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is the greatest num");
		}
		else if(b>c)
		{
			System.out.println(b+" is the greatest num");
		}
		else if(a==b && b==c)
		{
			System.out.println("all number equal");
		}
		else {
			System.out.println(c+" is greatest");
		}
	}

}
