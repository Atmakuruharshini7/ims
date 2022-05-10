package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Time t1=new Time(12,45,55);
Time t2=new Time(10,30,30);//invoke constructor and intialize the values
	t1.add(t2);//invoking add method padd t2 obj as argument
	System.out.println("addition of 2 times is : ");
	t1.display();
	}

}
