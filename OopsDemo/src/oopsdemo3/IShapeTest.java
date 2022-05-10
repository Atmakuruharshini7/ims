package oopsdemo3;

public class IShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IShape shape=new Circle(10);
System.out.println("using interface :"+shape.LABLE);
shape.draw();
System.out.println("area is "+shape.getArea());


shape=new Rectangle(10,7);
shape.draw();
System.out.println("area "+shape.getArea());
	}

}
