
public class CurrentAccount extends Account {
	
	int overdraftLimit;

	public CurrentAccount(int balance, int accNo, String name, int overdraftLimit) {
		super(balance, accNo, name);
		this.overdraftLimit = overdraftLimit;
	}
	
    public void withdraw(int withAmt) {
        if (this.balance - withAmt < (-overdraftLimit)){
            System.out.println("Only Balance is " + this.balance + " So Unable to withdraw");
        }
        else {
            this.balance -= withAmt;
            System.out.println("withdrawal of " + withAmt + " AvbBal is " + this.balance);
        }
    }

	public int getOverdraftLimit() {
		System.out.println("overdraftLimit: " + overdraftLimit);
		return overdraftLimit;
	}

}
