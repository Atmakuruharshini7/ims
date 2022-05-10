package oopsdemo3;

import java.util.Scanner;

public class Calculator implements IMath{
Scanner kb;
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("enter values to addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("enter values to substraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("substraction of "+a+" and "+b+" is "+s);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("enter values to multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("multiplication of "+a+" and "+b+" is "+s);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("enter values to divition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("div of "+a+" and "+b+" is "+s);
	}
void display() {
	System.out.println("my calvculator---designed by harshini");
}
}
