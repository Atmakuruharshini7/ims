package oopsdemo3;

public class EmployeePayTestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee eobj=new Manager("henry",5500.65,"sydney","accounts");

double payTotal=eobj.totalPay();
double less=eobj.deduction(5);
double netPay=payTotal-less;
System.out.println("\nManager details");
System.out.println("============================");
eobj.show();
System.out.println("total pay:\t\t"+payTotal);
System.out.println("net pay:\t\t"+netPay);

Employee dirObj = new Director("Stephen", 32400.00, "New York", 8000);
payTotal = dirObj.totalPay();
less = dirObj.deduction(3);
netPay = payTotal - less;
System.out.println("\n\nDirector Details");
System.out.println("============================");
dirObj.show();
System.out.println("Total Pay: \t\t" + payTotal);
System.out.println("Net Pay: \t\t" + netPay);

//  Employee e1=new Employee(); -- compiler error - cannot instantiate abstract class Employee
	}

}
