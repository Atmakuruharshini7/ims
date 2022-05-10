package oopsdemo2;

class Staff{
	private int empid;
	private String name;
	protected float salary,hra;
	public Staff(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	void getHRA() {
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
		System.out.println("gross salary : "+(salary+hra));
    }
   
    void display()
    {
        System.out.println(empid+" "+name+" "+salary);
    }
		
	}
class Manager extends Staff{
	protected float da;
	private float gross;
	
	public Manager(int empid, String name, float salary) {
		super(empid,name,salary);
	}
	
	void getDA()
    {
        da=(salary*80)/100;
        System.out.println("DA is : "+da);
    }
   
    void getGross()
    {
        gross= salary+hra+da;
        System.out.println("Gross Salary of Manager is :"+gross);
    }
}

class Director extends Manager
{
	private float ta,gross;
	public Director(int empId, String name, float salary) {
		super(empId, name, salary);
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is : "+ta);
	}
	void getGross() {
		gross=salary+hra+da+ta;
		System.out.println("gross salary of director : "+gross);
	}
	
}

public class MultiLevel2 {
public static void main(String[] args) {
	Director d1=new Director(101, "harshini", 5000);
	System.out.println("***********Director details*********");
	d1.display();
	d1.getHRA();
	d1.getDA();
	d1.getTA();
	d1.getGross();
	Manager m1=new Manager(222,"kraiti",7888);
	
	System.out.println("***********Managerr details*********");
	m1.display();
	m1.getHRA();
	m1.getDA();
	m1.getGross();
	
	Staff s1=new Staff(333,"vhsdh",2889);
	System.out.println("*********Staff details********");
	s1.display();
	s1.getHRA();
}
}
