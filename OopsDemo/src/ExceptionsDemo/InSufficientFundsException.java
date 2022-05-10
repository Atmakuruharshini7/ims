package ExceptionsDemo;

public class InSufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1402372443404233766L;
private double amount;

	public InSufficientFundsException(double amount) {
	this.amount = amount;
}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public double getAmount() {
		return amount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
