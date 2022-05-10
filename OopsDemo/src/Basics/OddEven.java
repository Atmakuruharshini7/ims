package Basics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input :");
		a=scan.nextInt();
		scan.close();
		
		if(a%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
