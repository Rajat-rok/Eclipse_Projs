
public class CurrentAccount extends Account {
	
	int overdraftLimit;

	public CurrentAccount(int balance, int accNo, String name, int overdraftLimit) {
		super(balance, accNo, name);
		this.overdraftLimit = overdraftLimit;
	}
	
    public Boolean withdraw(int withAmt) {
        if (this.balance - withAmt < (-overdraftLimit)){
            System.out.println("Only Balance is " + this.balance + " Unable to withdraw");
            return false;
        }
        else {
            this.balance -= withAmt;
            System.out.println("withdrawal of " + withAmt + " AvbBal is " + this.balance);
            return true;
        }
    }

	public int getOverdraftLimit() {
		//System.out.println("overdraftLimit: " + overdraftLimit);
		return overdraftLimit;
	}

}
