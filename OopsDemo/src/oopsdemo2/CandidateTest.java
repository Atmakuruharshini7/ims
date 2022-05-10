package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("*Candidate details***");
JavaCandidate jc1=new JavaCandidate(11,"king kevin", 3000,"hibernate");
	jc1.display();
    jc1.getPerks();

AccountsCandidate ac1=new AccountsCandidate(222,"hvhsha",3000);
	ac1.display();
	ac1.getPerks();
	}

}
