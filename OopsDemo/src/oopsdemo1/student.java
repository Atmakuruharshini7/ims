package oopsdemo1;

import java.util.Scanner;

public class student {
	
	int rollnumber;
	String name,course;
	float m1,m2,m3,total;
	Scanner s=new Scanner(System.in);
	public void inputDetails()//its a method doesnt return any value
	{
	System.out.println("Enter  Roll No,Name,course:");
    rollnumber=s.nextInt();
    name=s.next();
    course=s.next();
   
    System.out.println("Enter marks of 3 subjects:");
    m1=s.nextFloat();
    m2=s.nextFloat();
    m3=s.nextFloat();
	}
	public float calculate()
	{
		total=m1+m1+m3;
		return total;
	}
	public void DisplayDetails() {
		System.out.println("**********Student details ***********");
		 System.out.println("Roll No     :"+rollnumber);
	        System.out.println("Name        :"+name);
	        System.out.println("Course      :"+course);
	        System.out.println("Total Marks :"+total);
	        System.out.println("*************************************");
	}

}
