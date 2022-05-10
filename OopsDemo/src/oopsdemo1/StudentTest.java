package oopsdemo1;

public class StudentTest {

	public static void main(String[] args) {
		// creating object for student class
		student s1=new student();
		student s2=new student();
		student s3=new student();
//invoke methods of student class using dot operator
		s1.inputDetails();
		s2.inputDetails();
		s3.inputDetails();
		
		float t1=s1.calculate();
		float t2=s2.calculate();
		float t3=s3.calculate();
		
		s1.DisplayDetails();
		System.out.println("total displayed from main "+t1);
		s2.DisplayDetails();
		System.out.println("total displayed from main "+t2);
		s3.DisplayDetails();
		System.out.println("total displayed from main "+t3);
	}

}
