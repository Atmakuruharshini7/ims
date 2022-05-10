package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trainee t1=new Marks("john","new york",1001,35);
t1.show();
double marks=t1.calculateMarks();
System.out.println(t1+" "+marks);
	}

}
