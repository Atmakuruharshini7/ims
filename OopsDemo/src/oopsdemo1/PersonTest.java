package oopsdemo1;

import java.util.Scanner;

class Person {
	String name,constituency;
	int age;
	Scanner s;
	public Person() {
		System.out.println("Voter Eligibility App");
        age=0;
        name="";
        constituency="Bengaluru";
       s =new Scanner(System.in);
	}
	public Person(String name, String constituency, int age) {
		this.name = name;
		constituency = constituency;
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.constituency="Mumbai";
	}
	void input()
    {
        System.out.println("Enter ur Name:");
        name=s.nextLine();
        System.out.println("Enter ur Age:");
        age=s.nextInt();
    }

    void print()
    {
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Constituency is :"+constituency);
    }
}
	
    public class PersonTest {

    	public static void main(String[] args) {
    		Person objPerson1=new Person(); // invoke implicit constructor

            objPerson1.input();
            objPerson1.print();
            System.out.println("-------------------------------------");
            Person objPerson2=new Person("Mike",45); // invokes constructor with 2 args

            objPerson2.print();
            System.out.println("-------------------------------------");
            Person objPerson3=new Person("Ravi","Delhi",60); // invokes constructor with 3 args

            objPerson3.print();
            System.out.println("-------------------------------------");
            Scanner s=new Scanner(System.in);
            System.out.println("Enter ur Name, Constituency & Age :");
            String name=s.next();
            String c=s.next();
            int a=s.nextInt();
           
            Person objPerson4=new Person(name,c,a);
           
            objPerson4.print();
    	}

    }
	/*
	 * public class PersonTest {

 

    public static void main(String[] args) {
        
        Person objPerson1=new Person(); // invoke implicit constructor
        
        objPerson1.input();
        objPerson1.print();
        
        System.out.println("-------------------------------------");
        Person objPerson2=new Person("Mike",45); // invokes constructor with 2 args
        
        objPerson2.print();
        
        System.out.println("-------------------------------------");
        Person objPerson3=new Person("Navin","Chennai",45); // invokes constructor with 3 args
        
        objPerson3.print();
        
    System.out.println("-------------------------------------");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ur Name, Constituency & Age :");
        String name=s.next();
        String c=s.next();
        int a=s.nextInt();
        
        Person objPerson4=new Person(name,c,a);
        
        objPerson4.print();
    }
	 */


