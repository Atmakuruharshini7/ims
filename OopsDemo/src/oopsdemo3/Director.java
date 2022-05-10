package oopsdemo3;

public class Director extends Employee{
	double transportationallowances;

	public Director(String name, double basic, String address,double ta) {
		super(name, basic, address);
		this.transportationallowances=ta;
		// TODO Auto-generated constructor stub
	}
	void show() {
		super.show();
		System.out.println("transportationalallowances : \t\t"+transportationallowances);
	}
	@Override
	double totalPay() {
		double totalAmount=0;
		double houserentallowances=(basic*0.20);
		double dearnessallowances=(basic * 0.5);
		double medicalallowances=4500;
		double entertainmentallowances=5000;
		totalAmount=basic+entertainmentallowances+houserentallowances+dearnessallowances+medicalallowances;
		return totalAmount;
	}
	
}
