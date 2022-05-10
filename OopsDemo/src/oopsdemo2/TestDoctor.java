package oopsdemo2;
//hierarchical inheritance
class Doctor{
	int idnum;
	String name;
	String address;
	public Doctor(int idnum, String name, String address) {
		this.idnum = idnum;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println("****doctor details*****");
            System.out.println("The name is :" + name);
            System.out.println("The number is :" + idnum);
            System.out.println("The address is :" + address);
       }
	}
class Specialist extends Doctor{
	String speciality;

	public Specialist(int idnum, String name, String address, String sp) {
		super(idnum, name, address);
		this.speciality = sp;
	}
	void display() {
		super.display();
		System.out.println("the speciality is :"+speciality);
	}
	
}
class NonSpecialist extends Doctor{
	public NonSpecialist(int idnum, String name, String address ) {
		super(idnum, name,address);
	}
}
public class TestDoctor {
public static void main(String[] args) {
	//invoke child class specialist constructor
	Specialist spObj=new Specialist(1001,"ravi","nellore","neurospecialist");
	spObj.display();
	NonSpecialist nsObj=new NonSpecialist(1005,"john","sydney");
	nsObj.display();
}
}
