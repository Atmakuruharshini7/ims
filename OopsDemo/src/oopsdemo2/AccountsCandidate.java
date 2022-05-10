package oopsdemo2;

public class AccountsCandidate extends Candidate{
	double perks;
	
	public AccountsCandidate(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	
	}
void getPerks() {
	perks=salary*.5;
	System.out.println("perks of account candidate is : "+perks);
}
}
