package Basics;

import java.util.Scanner;

public class MultipleOrNot {

	public static void main(String[] args) {
		int n1,n2;
		Scanner scan =new Scanner(System.in) ;
		System.out.println("enter the number");
		n1 = scan.nextInt();
		System.out.println("enter the second number");
		n2 = scan.nextInt();
		scan.close();
		if(n2%n1 == 0)
		{
		System.out.println("The given number is multiple of the second");
		}
		else
		{
			System.out.println("The given number is not the multiple of second");
		}

	}

}
 