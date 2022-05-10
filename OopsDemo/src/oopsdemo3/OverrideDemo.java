package oopsdemo3;
class SoftwareEngineer{
	protected String name,tech;
	double salary;
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	void display() {
		System.out.println(name+" "+tech+" "+salary);
	}
	void work() {
		System.out.println("coding and testing");
	}
}
class Developer extends SoftwareEngineer{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
		// TODO Auto-generated constructor stub
	}
	void work() {//overriden method
		System.out.println("coding using : "+tech);
	}
	
}
class Tester extends SoftwareEngineer{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		// TODO Auto-generated constructor stub
	}
	void work() {//overriden method
		System.out.println(" testing "+tech);
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Developer d1=new Developer("hari","java",30000);
Tester t1=new Tester("mike","jmeter",34000);
d1.display();
d1.work();

t1.display();
t1.work();

	}

}
