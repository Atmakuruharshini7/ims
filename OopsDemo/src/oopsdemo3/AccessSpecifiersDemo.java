package oopsdemo3;

import oopsdemo1.Bicycle;

class Test{
	int a;
	private int b;
	protected int c;
	public int d;
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = 500;
	}
	public void display() {
		System.out.println("private variable ; "+b);
	}
	
}
class Test2 extends Test{

	public Test2(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("protected variable: "+c);
	}
	void print() {
		System.out.println("hello from default method");
	}
}



public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t1=new Test(100,200,300);
t1.display();


System.out.println("default variable : "+t1.a);
	Test2 t2=new Test2(100,200,300);
	t2.display();
	
	Bicycle sportsBicycle=new Bicycle();
	//access pubic method of oopsDemo1.Bicycle
	
	sportsBicycle.startCycling();

	//sportsBicycle.stopCycling();
	
	
	}

}
