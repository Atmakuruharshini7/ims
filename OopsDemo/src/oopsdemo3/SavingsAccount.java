package oopsdemo3;

public class SavingsAccount extends Account{
	double interestRate;

	public SavingsAccount(String name, double balance,double i) {
		super(name, balance);
		this.interestRate=i;
		// TODO Auto-generated constructor stub
	}
	

}
class CheckingAccount extends Account{
	double overdraft;

	public CheckingAccount(double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
		this.overdraft=od;
	}
	@Override
	void withdraw(double amt) {
        System.out.println("Overdraft Amount: " + overdraft);
           if (amt <= balance) {
              balance -= amt;
              System.out.println("Withdrawing: " + amt);
            } 
           else if ((amt > balance) && (amt > (balance + overdraft))) {
               System.out.println("Sorry! You cannot withdraw");
            }
           else {
               double result = amt - balance;
               overdraft -= result;
               balance = 0;

               System.out.println("Withdrawing: " + amt);
               System.out.println("Current Overdraft Amount: "
               + overdraft);
    }
   
}

	
	
}