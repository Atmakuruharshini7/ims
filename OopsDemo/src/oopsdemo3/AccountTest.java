package oopsdemo3;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount sa=new SavingsAccount("hari",500,4);
System.out.println("\nSavings Account Details");
System.out.println("------------------------");
System.out.println("" + sa.getName()
+ " has an initial Balance of: " + sa.getBalance());
sa.deposit(200);
sa.withdraw(300);
System.out.println("" + sa.getName()
+ " at the end of transaction has a Balance of: "
+ sa.getBalance());



System.out.println("\nChecking Account Details");
System.out.println("------------------------");



CheckingAccount ca = new CheckingAccount("Stephen", 500, 200);
System.out.println("" + ca.getName()
+ " has an initial Balance of: " + ca.getBalance());
ca.deposit(200);
ca.withdraw(1000);
System.out.println("" + ca.getName()
+ " at the end of transaction has a Balance of: "
+ ca.getBalance());
	}

}
