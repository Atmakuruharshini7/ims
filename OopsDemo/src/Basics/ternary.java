package Basics;

public class ternary {

	public static void main(String[] args) {
		int a=10,b=20,max;
		
		System.out.println("first number "+a);
		System.out.println("second number "+b);
		max=(a>b)?a:b;
		String msg=(a>b)?"A is greater num":"B is greater num";
		
		System.out.println("the max number is :"+max);

	}

}
