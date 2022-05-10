package oopsdemo3;

public class Manager extends Employee{
String department;

public Manager(String name, double basic, String address,String dept) {
	super(name, basic, address);
this.department=dept;
	// TODO Auto-generated constructor stub
}
void show() {
	super.show();
	System.out.println("department : \t\t"+department);
}
@Override
double totalPay() {
	double totalAmount=0;
	double houserentallowances=(basic*0.08);
	double dearnessallowances=(basic * 0.3);
	double medicalallowances=1500;
	totalAmount=basic+houserentallowances+dearnessallowances+medicalallowances;
return totalAmount;	
}
}
