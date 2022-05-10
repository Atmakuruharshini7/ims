package oopsdemo1;
//program to add 2 complex numbers
public class Complex {
	double real;
	double imaginary;
	//generate constructor using fields
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	void add(Complex obj)//method which accepts object as an arguments
	{
		//this is nothing but c1.real+=c2.real;
		this.real+=obj.real;
		//c1.imaginary+=c2.imaginary;
		this.imaginary+=obj.imaginary;
	}
	void display() {
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

}
