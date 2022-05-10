package oopsdemo3;
//rectangle class is implemented ishape interface

public class Rectangle implements IShape {
	private double width;
	private double height;
	

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
System.out.println("drawing a rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
