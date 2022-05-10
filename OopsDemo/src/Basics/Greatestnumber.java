package Basics;

import java.util.Scanner;

public class Greatestnumber {
	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers :");
		a=scan.nextInt();
		b=scan.nextInt();
		scan.close();
		
		
		
		if(a>b)
		{
			System.out.println(a+" is the greatest number");
		}
		else
		{
			System.out.println(b+" is the greatest number");
		}
	}

}
